package ru.shum;

/**
 * Перечисление, представляющее размер скидки.
 */
public enum DiscountSize {
  ZERO_PERCENT(0),
  FIVE_PERCENT(5),
  TEN_PERCENT(10),
  FIFTEEN_PERCENT(15),
  TWENTY_PERCENT(20);

  private final int discountPercentage;

  /**
   * Конструктор перечисления DiscountSize.
   *
   * @param discountPercentage Процент скидки.
   */
  DiscountSize(int discountPercentage) {
    this.discountPercentage = discountPercentage;
  }

  /**
   * Получить процент скидки.
   *
   * @return Процент скидки.
   */
  public int getDiscountPercentage() {
    return discountPercentage;
  }
}
