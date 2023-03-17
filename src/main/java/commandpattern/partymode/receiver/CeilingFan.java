package commandpattern.partymode.receiver;

public class CeilingFan {
  String location = "";
  int speed;
  public static final int high = 3;
  public static final int medium = 2;
  public static final int low = 1;
  public static final int off = 0;

  public CeilingFan(String location)
  {
    this.location = location;
  }
  public void high() {
    // turns the ceiling fan on to high
    speed = high;
    System.out.println(location + " ceiling fan is on high");
  }
  public void medium() {
    // turns the ceiling fan on to medium
    speed = medium;
    System.out.println(location + " ceiling fan is on medium");
  }
  public void low() {
    // turns the ceiling fan on to low
    speed = low;
    System.out.println(location + " ceiling fan is on low");
  }
  public void off() {
    // turns the ceiling fan off
    speed = off;
    System.out.println(location + " ceiling fan is off");
  }
  public int GetSpeed()
  {
    return speed;
  }
}
