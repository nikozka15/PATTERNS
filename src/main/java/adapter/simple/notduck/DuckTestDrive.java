package adapter.simple.notduck;


import adapter.simple.notduck.adaptee.Duck;
import adapter.simple.notduck.adaptee.MallardDuck;
import adapter.simple.notduck.adapter.DuckAdapter;
import adapter.simple.notduck.adapter.TurkeyAdapter;
import adapter.simple.notduck.targets.Turkey;
import adapter.simple.notduck.targets.WildTurkey;

public class DuckTestDrive {
  public static void main(String[] args) {
    MallardDuck duck = new MallardDuck();
    WildTurkey turkey = new WildTurkey();

    Duck turkeyAdapter = new TurkeyAdapter(turkey);
    Turkey duckAdapter = new DuckAdapter(duck);



    System.out.println("\nThe adapter.TurkeyAdapter says...");
    testDuck(turkeyAdapter);

    System.out.println("\nThe adapter.DuckAdapter says...");
    testTurkey(duckAdapter);
    duckAdapter.gobble();
    duckAdapter.fly();


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
