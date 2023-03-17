package factorymethod.pizza.factory.store;

import factorymethod.pizza.factory.ingredientfactory.ChicagoIngredientFactory;
import factorymethod.pizza.factory.ingredientfactory.PizzaIngredientFactory;
import factorymethod.pizza.product.pizza.CheesePizza;
import factorymethod.pizza.product.pizza.ClamPizza;
import factorymethod.pizza.product.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

  @Override
  protected Pizza createPizza(String type) {
    Pizza pizza = null;
    PizzaIngredientFactory pizzaIngredientFactory = new ChicagoIngredientFactory();
    if (type.equals("cheese")) {
      pizza = new CheesePizza(pizzaIngredientFactory);
      pizza.setName("Chicago Style product.ingredient.Cheese product.pizza.Pizza");
    } else if (type.equals("clam")) {
      pizza = new ClamPizza(pizzaIngredientFactory);
      pizza.setName("Chicago Style Clam product.pizza.Pizza");

//    } else if (type.equals("veggie")) {
//    pizza = new VeggiePizza(pizzaIngredientFactory);
//    pizza.setName("Chicago Style Veggie product.pizza.Pizza");
//
//    } else if (type.equals("pepperoni")) {
//      pizza = new PepperoniPizza(pizzaIngredientFactory);
//      pizza.setName("Chicago Style product.ingredient.Pepperoni product.pizza.Pizza");
    }
    return pizza;
  }
}