package decoratorpattern.decorator;

import decoratorpattern.component.Beverage;

public class Milk extends CondimentDecorator{
  Beverage beverage;

  public Milk(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public double cost() {
    return beverage.cost() + .10;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Milk";
  }

  @Override
  public String getSize() {
    return null;
  }
}
