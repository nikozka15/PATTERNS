package adapter.simple.notduck.adapter;

import adapter.simple.notduck.adaptee.Duck;
import adapter.simple.notduck.targets.Turkey;

public class TurkeyAdapter implements Duck {
  Turkey turkey;

  public TurkeyAdapter(Turkey turkey) {
    this.turkey = turkey;
  }

  public void quack() {
    turkey.gobble();
  }

  public void fly() {
    for(int i=0; i < 5; i++) {
      turkey.fly();
    }
  }
}
