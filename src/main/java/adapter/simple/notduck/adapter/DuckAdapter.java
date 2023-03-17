package adapter.simple.notduck.adapter;

import adapter.simple.notduck.adaptee.Duck;
import adapter.simple.notduck.targets.Turkey;

public class DuckAdapter implements Turkey {
  Duck duck;
  public DuckAdapter(Duck duck) {
    this.duck = duck;
  }

    @Override
  public void gobble() {
      for (int i = 0; i < 5; i++) {
        duck.quack();
      }
    }

  public void fly() {
    duck.fly();
    System.out.println(" still flying!");
    }
}
