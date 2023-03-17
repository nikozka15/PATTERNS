package strategy.duck;


import strategy.duck.behavior.fly.FlyRocketPowered;
import strategy.duck.species.Duck;
import strategy.duck.species.MallardDuck;
import strategy.duck.species.ModelDuck;

public class MiniDuckSimulator {
  public static void main(String[] args) {
    Duck mallard = new MallardDuck();
    mallard.performQuack();
    mallard.performFly();
    Duck model = new ModelDuck();
    model.performFly();
    model.setFlyBehavior(new FlyRocketPowered());
    model.performFly();
  }
}
