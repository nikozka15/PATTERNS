package adapter.twowayadapter.duckturkey.adapter;

import adapter.twowayadapter.duckturkey.adaptee.Duck;
import adapter.twowayadapter.duckturkey.targets.Turkey;

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
