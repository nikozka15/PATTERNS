package decoratorpattern.decorator;

import decoratorpattern.component.Beverage;

public class Soy extends CondimentDecorator{
  Beverage beverage;
  public Soy(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public double cost() {
    return beverage.cost() + .15;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Soy";
  }

  @Override
  public String getSize() {
    return beverage.getSize();
  }
}
