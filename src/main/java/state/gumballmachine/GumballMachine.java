package state.gumballmachine;

public class GumballMachine {
  State soldOut;
  State sold;
  State noQuarter;
  State hasQuarter;
  State winner;
  State state = soldOut;
  int count = 0;


  public GumballMachine(int numberOfGums) {
    sold = new SoldState(this);
    noQuarter = new NoQuarterState(this);
    hasQuarter = new HasQuarterState(this);
    soldOut = new SoldOutState(this);
    winner = new WinnerState(this);
    this.count = numberOfGums;
    if (numberOfGums > 0) {
      state = noQuarter;
    }
  }
  public void insertQuarter() {
    state.insertQuarter();
  }
  public void ejectQuarter() {
    state.ejectQuarter();
  }
  public void turnCrank() {
    state.turnCrank();
    state.dispense();
  }
  public State getSoldOut() {
    return soldOut;
  }
  public State getSold() {
    return sold;
  }
  public State getNoQuarter() {
    return noQuarter;
  }
  public State getHasQuarter() {
    return hasQuarter;
  }

  public int getCount() {
    return count;
  }

  public State getWinner() {
    return winner;
  }
  public void setState(State state) {
    this.state = state;
  }
  void releaseBall() {
    System.out.println("A gumball comes rolling out the slot...");
    if (count != 0) {
      count = count - 1;
    }
  }
  void refill(int count) {
    state = noQuarter;
    this.count = count;

  }
//  final static int SOLD_OUT = 0;
//  final static int NO_QUARTER = 1;
//  final static int HAS_QUARTER = 2;
//  final static int SOLD = 3;
//  int state = SOLD_OUT;
//  int count = 0;
//
//  public GumballMachine(int count) {
//    this.count = count;
//    if (count > 0) {
//      state = NO_QUARTER;
//    }
//  }
//
//  public void insertQuarter() {
//    if (state == HAS_QUARTER) {
//      System.out.println("You can’t insert another quarter");
//    } else if (state == NO_QUARTER) {
//      state = HAS_QUARTER;
//      System.out.println("You inserted a quarter");
//    } else if (state == SOLD_OUT) {
//      System.out.println("You can’t insert a quarter, the machine is sold out");
//    } else if (state == SOLD) {
//      System.out.println("Please wait, we’re already giving you a gumball");
//    }
//  }
//  public void ejectQuarter() {
//    if (state == HAS_QUARTER) {
//      System.out.println("Quarter returned");
//      state = NO_QUARTER;
//    } else if (state == NO_QUARTER) {
//      System.out.println("You haven’t inserted a quarter");
//    } else if (state == SOLD) {
//      System.out.println("Sorry, you already turned the crank");
//    } else if (state == SOLD_OUT) {
//      System.out.println("You can’t eject, you haven’t inserted a quarter yet");
//    }
//  }
//  public void turnCrank() {
//    if (state == SOLD) {
//      System.out.println("Turning twice doesn’t get you another gumball!");
//    } else if (state == NO_QUARTER) {
//      System.out.println("You turned but there’s no quarter");
//    } else if (state == SOLD_OUT) {
//      System.out.println("You turned, but there are no gumballs");
//    } else if (state == HAS_QUARTER) {
//      System.out.println("You turned...");
//      state = SOLD;
//      dispense();
//    }
//  }
//  public void dispense() {
//    if (state == SOLD) {
//      System.out.println("A gumball comes rolling out the slot");
//      count = count - 1;
//      if (count == 0) {
//        System.out.println("Oops, out of gumballs!");
//        state = SOLD_OUT;
//      } else {
//        state = NO_QUARTER;
//      }
//    } else if (state == NO_QUARTER) {
//      System.out.println("You need to pay first");
//    } else if (state == SOLD_OUT) {
//      System.out.println("No gumball dispensed");
//    } else if (state == HAS_QUARTER) {
//      System.out.println("No gumball dispensed");
//    }
//  }

  @Override
  public String toString() {
    return "GumballMachine{" +
      "state=" + state +
      ", count=" + count +
      '}';
  }
}
