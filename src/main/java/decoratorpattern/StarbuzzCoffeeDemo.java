package decoratorpattern;

import decoratorpattern.component.Beverage;
import decoratorpattern.component.DarkRoast;
import decoratorpattern.component.Espresso;
import decoratorpattern.component.HouseBlend;
import decoratorpattern.decorator.Mocha;
import decoratorpattern.decorator.Soy;
import decoratorpattern.decorator.Whip;

public class StarbuzzCoffeeDemo {
  public static void main(String[] args) {
    Beverage beverage = new Espresso();
    System.out.println(beverage.getDescription() + "$" + beverage.cost());

    Beverage beverage2 = new DarkRoast();
    beverage2.setSize("large");
    beverage2 = new Mocha(beverage2);
    beverage2 = new Mocha(beverage2);
    beverage2 = new Whip(beverage2);
    System.out.println(beverage2.getDescription() + "$" + beverage2.cost());

    Beverage beverage3 = new HouseBlend();
    beverage3 = new Soy(beverage3);
    beverage3 = new Mocha(beverage3);
    beverage3 = new Whip(beverage3);
    System.out.println(beverage3.getDescription() + "$" + beverage3.cost());

    }
  }

