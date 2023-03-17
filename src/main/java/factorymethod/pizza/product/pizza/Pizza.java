package factorymethod.pizza.product.pizza;

import factorymethod.pizza.product.ingredient.Clams;
import factorymethod.pizza.product.ingredient.Cheese;
import factorymethod.pizza.product.ingredient.Dough;
import factorymethod.pizza.product.ingredient.Pepperoni;
import factorymethod.pizza.product.ingredient.Sauce;
import factorymethod.pizza.product.ingredient.Veggies;

import java.util.Arrays;

public abstract class Pizza {
  String name;
  Dough dough;
  Sauce sauce;
  Veggies[] veggies;
  Cheese cheese;
  Pepperoni pepperoni;
  Clams clams;

     public abstract void prepare();
     public void bake() {
       System.out.println("Bake for 25 minutes at 350");
     }
     public void cut() {
       System.out.println("Cutting the pizza into diagonal slices");
     }
     public void box() {
       System.out.println("Place pizza in official factory.store.PizzaStore box");
     }
     public String getName () {
       return name;
     }
     public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "product.pizza.Pizza{" +
      "name='" + name + '\'' +
      ", dough=" + dough +
      ", sauce=" + sauce +
      ", veggies=" + Arrays.toString(veggies) +
      ", cheese=" + cheese +
      ", pepperoni=" + pepperoni +
      ", clams=" + clams +
      '}';
  }
}

