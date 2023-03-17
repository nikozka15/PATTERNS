package adapter.twowayadapter.duckturkey.adapter;
import adapter.twowayadapter.duckturkey.adaptee.Duck;
import adapter.twowayadapter.duckturkey.targets.Turkey;
public class TurkeyAdapter implements Duck, Turkey {
  Turkey turkey;

  public TurkeyAdapter(Turkey turkey) {
    this.turkey = turkey;
  }
@Override
  public void quack() {
    turkey.gobble();
  }

  @Override
  public void gobble() {
     turkey.gobble();
  }


@Override
  public void fly() {
    for(int i=0; i < 5; i++) {
      turkey.fly();
    }
  }
}
