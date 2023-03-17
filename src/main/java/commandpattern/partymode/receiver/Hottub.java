package commandpattern.partymode.receiver;

public class Hottub {
  boolean on;
  int temperature;

  public Hottub(){}

  public boolean on() {

    on = true;
  return on;}

  public boolean off() {
    on = false;
    return on;}

  public String bubblesOn(){
    if (on) return "Hottub is bubbling!";

    return null;
  }

  public String bubblesOff(){
    if (on) return "Hottub is not bubbling";

    return null;
  }

  public String jetsOn(){
    if (on) return "Hottub jets are on";

    return null;
  }

  public String jetsOff() {
    if (on) return "Hottub jets are off";

    return null;
  }

  public int setTemperature(int temperature) {
    this.temperature = temperature;
    return temperature;
  }

  public void heat() {
    temperature = 105;
    System.out.println("Hottub is heating to a steaming 105 degrees");
  }

  public void cool() {
    temperature = 98;
    System.out.println("Hottub is cooling to 98 degrees");
  }
}


