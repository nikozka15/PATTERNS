package decoratorpattern.decorator;

import decoratorpattern.component.Beverage;

public class Whip extends CondimentDecorator{
  Beverage beverage;

  public Whip(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public double cost() {
    return beverage.cost() + .10;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Whip";
  }

  @Override
  public String getSize() {
    return beverage.getSize();
  }
}
