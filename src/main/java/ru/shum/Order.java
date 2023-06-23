package ru.shum;

/**
 * Класс, представляющий заказ.
 */
public class Order {

  private Customer customer; // Объект покупатель
  private Product product; // Объект товар
  private int quantity; // Количество
  private double cost;

  /**
   * Конструктор класса Order.
   *
   * @param customer Покупатель.
   * @param product  Товар.
   * @param quantity Количество товара.
   */
  public Order(Customer customer, Product product, int quantity, double cost) {
    this.customer = customer;
    this.product = product;
    this.quantity = quantity;
    this.cost = cost;
  }
  // Геттеры для свойств заказа

  /**
   * Получить покупателя заказа.
   * @return Покупатель заказа.
   */
  public Customer getCustomer() {
    return customer;
  }

  /**
   * Получить товар заказа.
   * @return Товар заказа.
   */
  public Product getProduct() {
    return product;
  }

  /**
   * Получить

   количество товара в заказе.
   * @return Количество товара в заказе.
   */
  public int getQuantity() {
    return quantity;
  }

  /**
   * Получить стоимость заказа.
   * @return Стоимость заказа.
   */
  public double getCost() {
    return cost;
  }
}

