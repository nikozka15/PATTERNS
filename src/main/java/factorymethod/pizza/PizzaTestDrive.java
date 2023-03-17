package factorymethod.pizza;

import factorymethod.pizza.factory.store.ChicagoPizzaStore;
import factorymethod.pizza.factory.store.NYPizzaStore;
import factorymethod.pizza.factory.store.PizzaStore;
import factorymethod.pizza.product.pizza.Pizza;

public class PizzaTestDrive {
  public static void main(String[] args) {
    PizzaStore nyStore = new NYPizzaStore();
    PizzaStore chicagoStore = new ChicagoPizzaStore();

    Pizza pizza = nyStore.orderPizza("cheese");
    System.out.println("Ethan ordered a " + pizza.getName() + "\n");

    pizza = chicagoStore.orderPizza("cheese");
    System.out.println("Joel ordered a " + pizza.getName() + "\n");
  }
}
