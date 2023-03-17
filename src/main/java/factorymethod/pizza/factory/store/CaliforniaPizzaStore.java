package factorymethod.pizza.factory.store;

import factorymethod.pizza.factory.ingredientfactory.CaliforniaIngredientFactory;
import factorymethod.pizza.factory.ingredientfactory.PizzaIngredientFactory;
import factorymethod.pizza.product.pizza.CheesePizza;
import factorymethod.pizza.product.pizza.ClamPizza;
import factorymethod.pizza.product.pizza.Pizza;

public class CaliforniaPizzaStore extends PizzaStore {

  @Override
  protected Pizza createPizza(String type) {
    Pizza pizza = null;
    PizzaIngredientFactory pizzaIngredientFactory = new CaliforniaIngredientFactory();
    if (type.equals("cheese")) {
      pizza = new CheesePizza(pizzaIngredientFactory);
      pizza.setName("California Style product.ingredient.Cheese product.pizza.Pizza");
    } else if (type.equals("clam")) {
      pizza = new ClamPizza(pizzaIngredientFactory);
      pizza.setName("California Style Clam product.pizza.Pizza");

//    } else if (type.equals("veggie")) {
//    pizza = new VeggiePizza(pizzaIngredientFactory);
//    pizza.setName("California Style Veggie product.pizza.Pizza");
//
//    } else if (type.equals("pepperoni")) {
//      pizza = new PepperoniPizza(pizzaIngredientFactory);
//      pizza.setName("California Style product.ingredient.Pepperoni product.pizza.Pizza");
    }
    return pizza;
  }
}
