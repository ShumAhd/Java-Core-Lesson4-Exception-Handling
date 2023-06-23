package ru.shum;

/**
 * Класс, представляющий товар.
 */
public class Product {

  private String name;
  private double price;
  private Category category;


  /**
   * Конструктор класса Product.
   *
   * @param name     Название товара.
   * @param price    Цена товара.
   * @param category Категория товара.
   */
  public Product(String name, double price, Category category) {
    this.name = name;
    this.price = price;
    this.category = category;

  }
  // Геттеры и сеттеры для свойств товара

  /**
   * Получить название товара.
   *
   * @return Название товара.
   */
  public String getName() {
    return name;
  }

  /**
   * Установить название товара.
   *
   * @param name Название товара.
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Получить цену товара.
   *
   * @return Цена товара.
   */
  public double getPrice() {
    return price;
  }

  /**
   * Установить цену товара.
   *
   * @param price Цена товара.
   */
  public void setPrice(double price) {
    this.price = price;
  }

  /**
   * Получить категорию товара.
   *
   * @return Категория товара.
   */
  public Category getCategory() {
    return category;
  }

  /**
   * Установить категорию товара.
   *
   * @param category Категория товара.
   */
  public void setCategory(Category category) {
    this.category = category;
  }

}
