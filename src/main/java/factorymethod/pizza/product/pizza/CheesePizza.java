package factorymethod.pizza.product.pizza;

import factorymethod.pizza.factory.ingredientfactory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
  PizzaIngredientFactory pizzaIngredientFactory;
  public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
    this.pizzaIngredientFactory = pizzaIngredientFactory;

  }

  @Override
 public void prepare() {
    System.out.println("Preparing " + name);
    dough = pizzaIngredientFactory.createDough();
    sauce = pizzaIngredientFactory.createSauce();
    cheese = pizzaIngredientFactory.createCheese();
  }
}
