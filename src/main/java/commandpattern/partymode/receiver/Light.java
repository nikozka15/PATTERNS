package commandpattern.partymode.receiver;

public class Light {
  private String location;

  public Light(String location) {
    this.location = location;
  }

  public void on() { System.out.println(location + " light is turned on!");
  }
  public void off() {
    System.out.println(location + "light is turned off!");
  }
  public void dim() { System.out.println(location + "light is dim!");
  }
}
