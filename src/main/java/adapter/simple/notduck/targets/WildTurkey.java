package adapter.simple.notduck.targets;

public class WildTurkey implements Turkey {
  public void gobble() {
    System.out.println("Gobble gobble");
  }
  public void fly() {
    System.out.println("I’m flying a short distance");
  }
}