package facade.hometheatre;

public class Amplifier {
  public void on() {
    System.out.println("Top-O-Line facade.Amplifier on");
  }

  public void setDvd(DvdPlayer dvd) {
    System.out.println("Top-O-Line facade.Amplifier setting DVD player to Top-O-Line DVD Player");
  }

  public void setSurroundSound() {
    System.out.println("Top-O-Line facade.Amplifier surround sound on (5 speakers, 1 subwoofer)");
  }

  public void setVolume(int i) {
    System.out.println("Top-O-Line Amplifi er setting volume to " + i);
  }

  public void off() {
    System.out.println("Top-O-Line facade.Amplifier off");
  }
}
