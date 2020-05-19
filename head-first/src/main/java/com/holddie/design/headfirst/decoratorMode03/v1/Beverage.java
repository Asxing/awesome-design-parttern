package com.holddie.design.headfirst.decoratorMode03.v1;

/**
 * 饮料抽象
 *
 * @date 2020/5/19 6:38 PM
 * @author Thomas Yang
 * @version 1.0
 */
public abstract class Beverage {
  protected String description = "Unknown Beverage";
  /**
   * 计价抽象方法
   *
   * @date 2020/5/19 6:37 PM
   * @author Thomas Yang
   */
  public abstract double cost();

  /**
   * 获取描述
   *
   * @date 2020/5/19 6:38 PM
   * @author Thomas Yang
   */
  public String getDescription() {
    return this.description;
  }

  @Override
  public String toString() {
    return "Beverage{" + "description='" + getDescription() + '\'' + " cost=" + cost() + '}';
  }
}
