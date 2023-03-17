package decoratorpattern.decorator;

import decoratorpattern.component.Beverage;

import java.util.Objects;

public class Mocha extends CondimentDecorator{
  Beverage beverage;


  public Mocha(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public double cost() {
    double v = beverage.cost();
    if(Objects.equals(beverage.getSize(), "small")) v += .10;
    if(Objects.equals(beverage.getSize(), "medium")) v += .15;
    if(Objects.equals(beverage.getSize(), "large")) v += .20;
    return v;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Mocha";
  }

  @Override
  public String getSize() {
    return beverage.getSize();
  }
}
