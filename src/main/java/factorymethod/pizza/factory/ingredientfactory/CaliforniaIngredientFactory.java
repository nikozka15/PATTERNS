package factorymethod.pizza.factory.ingredientfactory;

import factorymethod.pizza.product.ingredient.Cheese;
import factorymethod.pizza.product.ingredient.Clams;
import factorymethod.pizza.product.ingredient.CreamSauce;
import factorymethod.pizza.product.ingredient.Dough;
import factorymethod.pizza.product.ingredient.FreshClams;
import factorymethod.pizza.product.ingredient.Garlic;
import factorymethod.pizza.product.ingredient.Mozzarella;
import factorymethod.pizza.product.ingredient.Mushroom;
import factorymethod.pizza.product.ingredient.Onion;
import factorymethod.pizza.product.ingredient.Pepperoni;
import factorymethod.pizza.product.ingredient.RedPepper;
import factorymethod.pizza.product.ingredient.Sauce;
import factorymethod.pizza.product.ingredient.SlicedPepperoni;
import factorymethod.pizza.product.ingredient.ThickCrustDough;
import factorymethod.pizza.product.ingredient.Veggies;

public class CaliforniaIngredientFactory implements PizzaIngredientFactory {
  public Dough createDough() {
    return new ThickCrustDough();
  }
  public Sauce createSauce() {
    return new CreamSauce();
  }
  public Cheese createCheese() {
    return new Mozzarella();
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
