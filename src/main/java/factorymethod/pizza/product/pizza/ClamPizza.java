package factorymethod.pizza.product.pizza;

import factorymethod.pizza.factory.ingredientfactory.PizzaIngredientFactory;

public class ClamPizza extends Pizza {
  PizzaIngredientFactory pizzaIngredientFactory;
  public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
    this.pizzaIngredientFactory = pizzaIngredientFactory;
  }

  @Override
  public void prepare() {
    System.out.println("Preparing " + name);
    dough = pizzaIngredientFactory.createDough();
    sauce = pizzaIngredientFactory.createSauce();
    clams = pizzaIngredientFactory.createClam();
  }
}
