package commandpattern.better.receiver;

public class GarageDoor {
  String location;

  public GarageDoor(String location) {
    this.location = location;
  }

  public void up() {System.out.println("Garage door is up!");
  }
  public void down() {System.out.println("Garage door is down!");
  }
  public void stop() {System.out.println("Garage door is stopped!");
  }
  public void lightOn() {System.out.println("light is turned up!");
  }
  public void lightOff() {System.out.println("light is turned off!");
  }
}
