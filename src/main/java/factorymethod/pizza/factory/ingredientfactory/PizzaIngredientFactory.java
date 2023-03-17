package factorymethod.pizza.factory.ingredientfactory;

import factorymethod.pizza.product.ingredient.Cheese;
import factorymethod.pizza.product.ingredient.Clams;
import factorymethod.pizza.product.ingredient.Dough;
import factorymethod.pizza.product.ingredient.Pepperoni;
import factorymethod.pizza.product.ingredient.Sauce;
import factorymethod.pizza.product.ingredient.Veggies;

public interface PizzaIngredientFactory {
  public Dough createDough();
  public Sauce createSauce();
  public Cheese createCheese();
  public Veggies[] createVeggies();
  public Pepperoni createPepperoni();
  public Clams createClam();
}
