package decoratorpattern.decorator;

import decoratorpattern.component.Beverage;

public abstract class CondimentDecorator extends Beverage {
  public abstract String getDescription();
  public abstract String getSize();

}
