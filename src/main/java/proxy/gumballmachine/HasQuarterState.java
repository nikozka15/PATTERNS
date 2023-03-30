package proxy.gumballmachine;

import java.util.Random;

public class HasQuarterState implements State {
  Random randomWinner = new Random(System.currentTimeMillis());
transient GumballMachine gumballMachine;
  public HasQuarterState(GumballMachine gumballMachine) {
  this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("You can’t insert another quarter");
  }

  @Override
  public void ejectQuarter() {
    System.out.println("Quarter returned");
    gumballMachine.setState(gumballMachine.getNoQuarter());
  }

  public void turnCrank() {
    System.out.println("You turned...");
    int winner = randomWinner.nextInt(10);
    if ((winner == 0) && (gumballMachine.getCount() > 1)) {
      gumballMachine.setState(gumballMachine.getWinner());
    } else {
      gumballMachine.setState(gumballMachine.getSold());
    }
  }

  @Override
  public void dispense() {
// shouldnt happened
    System.out.println("No gumball dispensed");
  }
  @Override
  public String ToString(){
    return "waiting for turn of crank";
  }
}
