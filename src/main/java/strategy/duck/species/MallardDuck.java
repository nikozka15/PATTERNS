package strategy.duck.species;


import strategy.duck.behavior.fly.FlyWithWings;
import strategy.duck.behavior.quack.Quack;

public class MallardDuck extends Duck {
  public MallardDuck() {
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }
  public void display() {
    System.out.println("I’m a real Mallard duck");
  }
}

