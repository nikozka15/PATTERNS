package strategy.duck.species;


import strategy.duck.behavior.fly.FlyNoWay;
import strategy.duck.behavior.quack.Quack;

public class ModelDuck extends Duck {
  public ModelDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new Quack();
  }

  @Override
  public void display() {
    System.out.println("I am a model duck");
  }
}
