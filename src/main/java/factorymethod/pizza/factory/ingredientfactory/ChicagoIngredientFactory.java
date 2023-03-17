package factorymethod.pizza.factory.ingredientfactory;

import factorymethod.pizza.product.ingredient.BlackOlives;
import factorymethod.pizza.product.ingredient.Cheese;
import factorymethod.pizza.product.ingredient.Clams;
import factorymethod.pizza.product.ingredient.Dough;
import factorymethod.pizza.product.ingredient.EggPlant;
import factorymethod.pizza.product.ingredient.FrozenClams;
import factorymethod.pizza.product.ingredient.Mozzarella;
import factorymethod.pizza.product.ingredient.Pepperoni;
import factorymethod.pizza.product.ingredient.PlumTomatoSauce;
import factorymethod.pizza.product.ingredient.Sauce;
import factorymethod.pizza.product.ingredient.SlicedPepperoni;
import factorymethod.pizza.product.ingredient.Spinach;
import factorymethod.pizza.product.ingredient.ThickCrustDough;
import factorymethod.pizza.product.ingredient.Veggies;

public class ChicagoIngredientFactory implements PizzaIngredientFactory {
  public Dough createDough() {
    return new ThickCrustDough();
  }
  public Sauce createSauce() {
    return new PlumTomatoSauce();
  }
  public Cheese createCheese() { return new Mozzarella();
  }
  public Veggies[] createVeggies() {
    Veggies veggies[] = { new Spinach(), new EggPlant(), new BlackOlives() };
    return veggies;
  }
  public Pepperoni createPepperoni() {
    return new SlicedPepperoni();
  }
  public Clams createClam() {
    return new FrozenClams();
  }
}
