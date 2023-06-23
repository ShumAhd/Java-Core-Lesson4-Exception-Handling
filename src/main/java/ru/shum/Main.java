package ru.shum;

import java.util.Random;

/**
 * Главный класс программы.
 */
public class Main {

  public static void main(String[] args) {
    //Создаем и инициализируем массив покупателей
    Customer[] customers = {
        new Customer("Иванов", "Иван", 25, "123456789", Gender.MALE),
        new Customer("Петрова", "Мария", 30, "987654321", Gender.FEMALE)};
    // Создаём массив товаров
    Product[] products = {
        new Product("Товар 1", 100.0, Category.STANDARD),
        new Product("Товар 2", 200.0, Category.STANDARD),
        new Product("Товар 3", 300.0, Category.PREMIUM),
        new Product("Товар 4", 400.0, Category.PREMIUM),
        new Product("Товар 5", 500.0, Category.STANDARD),
    };
    // Создаем массив заказов
    Random random = new Random();
    int orderCount = random.nextInt(10) + 1; // Генерация случайного числа от 1 до 10
    Order[] orders = new Order[orderCount];

    for (int i = 0; i < orders.length; i++) {
      Customer randomCustomer = customers[random.nextInt(customers.length)];
      Product randomProduct = products[random.nextInt(products.length)];
      int randomQuantity = random.nextInt(10) - 1;

      // Вызываем метод совершения покупки для заполнения массива заказов
      try {
        orders[i] = makePurchase(randomCustomer, randomProduct, randomQuantity);
      } catch (CustomerException e) {
        System.out.println("Ошибка: " + e.getMessage());
        System.out.println("Завершение работы программы.");
        return;
      } catch (ProductException e) {
        System.out.println("Ошибка: " + e.getMessage());
        System.out.println("Товар не будет добавлен в заказ.");
      } catch (AmountException e) {
        System.out.println("Ошибка: " + e.getMessage() + " - " + randomCustomer.getLastName() + ", "
            + randomProduct.getName());
      }
    }

    // Выводим информацию о совершенных покупках
    System.out.println("Итоговое количество совершенных покупок: " + getOrderCount(orders));
  }

  /**
   * Метод для совершения покупки.
   *
   * @param customer покупатель
   * @param product  товар
   * @param quantity количество товара
   * @return объект заказа
   * @throws CustomerException если передан несуществующий покупатель
   * @throws ProductException  если передан несуществующий товар
   * @throws AmountException   если передано отрицательное или слишком большое значение количества
   */
  public static Order makePurchase(Customer customer, Product product, int quantity)
      throws CustomerException, ProductException, AmountException {
    // Проверяем, что покупатель существует
    if (customer == null) {
      throw new CustomerException("Несуществующий покупатель");
    }

    // Проверяем, что товар существует
    if (product == null) {
      throw new ProductException("Несуществующий товар");
    }

    // Проверяем значение количества товара
    if (quantity <= 0 || quantity > 5) {
      throw new AmountException("Неверное количество товара");
    }
    // Создаем и возвращаем объект заказа
    return new Order(customer, product, quantity);
  }

  /**
   * Метод для подсчета общего количества совершенных покупок.
   *
   * @param orders массив заказов
   * @return общее количество покупок
   */
  public static int getOrderCount(Order[] orders) {
    int count = 0;
    for (Order order : orders) {
      if (order != null) {
        count++;
      }
    }
    return count;
  }
}


