package adapter.twowayadapter.duckturkey;

import adapter.twowayadapter.duckturkey.adaptee.Duck;
import adapter.twowayadapter.duckturkey.adaptee.MallardDuck;
import adapter.twowayadapter.duckturkey.adapter.TurkeyAdapter;
import adapter.twowayadapter.duckturkey.targets.Turkey;
import adapter.twowayadapter.duckturkey.targets.WildTurkey;

public class TestDrive {
  public static void main(String[] args) {
    MallardDuck duck = new MallardDuck();
    WildTurkey turkey = new WildTurkey();

    Duck turkeyAdapter = new TurkeyAdapter(turkey);
    Turkey normalTurkeyAdapter = new TurkeyAdapter(turkey);

    turkeyAdapter.quack();
    turkeyAdapter.fly();

    normalTurkeyAdapter.gobble();
    normalTurkeyAdapter.fly();

    testDuck(turkeyAdapter);
    testTurkey(normalTurkeyAdapter);

//   System.out.println("\nThe TurkeyAdapter says...");
  }
  static void testDuck(Duck duck) {
    duck.quack();
    duck.fly();
  }
  static void testTurkey(Turkey turkey) {
    turkey.gobble();
    turkey.fly();
  }
}
