package factorymethod.pizza.factory.ingredientfactory;

import factorymethod.pizza.product.ingredient.Cheese;
import factorymethod.pizza.product.ingredient.Clams;
import factorymethod.pizza.product.ingredient.Dough;
import factorymethod.pizza.product.ingredient.FreshClams;
import factorymethod.pizza.product.ingredient.Garlic;
import factorymethod.pizza.product.ingredient.MarinaraSauce;
import factorymethod.pizza.product.ingredient.Mushroom;
import factorymethod.pizza.product.ingredient.Onion;
import factorymethod.pizza.product.ingredient.Pepperoni;
import factorymethod.pizza.product.ingredient.RedPepper;
import factorymethod.pizza.product.ingredient.ReggianoCheese;
import factorymethod.pizza.product.ingredient.Sauce;
import factorymethod.pizza.product.ingredient.SlicedPepperoni;
import factorymethod.pizza.product.ingredient.ThinCrustDough;
import factorymethod.pizza.product.ingredient.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
  public Dough createDough() {
    System.out.print("Taking 200 grams of dough.");
    return new ThinCrustDough();
  }
  public Sauce createSauce() {
    System.out.print("Putting 50 grams of sauce.");
    return new MarinaraSauce();
  }
  public Cheese createCheese() {
    System.out.println("Topping with 200 grams of cheese.");
    return new ReggianoCheese();
  }
  public Veggies[] createVeggies() {
    Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
    return veggies;
  }
  public Pepperoni createPepperoni() {
    return new SlicedPepperoni();
  }
  public Clams createClam() {
    return new FreshClams();
  }
}
