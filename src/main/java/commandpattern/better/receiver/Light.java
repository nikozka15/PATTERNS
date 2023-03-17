package commandpattern.better.receiver;

public class Light {
  String location;

  public Light(String location) {
    this.location = location;
  }

  public void on() { System.out.println(location + " light is turned on!");
  }
  public void off() {
    System.out.println(location + "light is turned off!");
  }
}
