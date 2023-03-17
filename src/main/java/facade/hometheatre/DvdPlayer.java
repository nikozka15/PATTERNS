package facade.hometheatre;

public class DvdPlayer {
  public void on() {
    System.out.println("Top-O-Line DVD Player on");
  }

  public void play(String movie) {
    System.out.println("Top-O-Line DVD Player playing " + movie);
  }

  public void stop() {
    System.out.println("Top-O-Line DVD Player stopped");
  }

  public void eject() {
    System.out.println("Top-O-Line DVD Player eject");
  }

  public void off() {
    System.out.println("Top-O-Line DVD Player off");

  }
}
