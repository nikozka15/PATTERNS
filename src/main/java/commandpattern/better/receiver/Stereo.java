package commandpattern.better.receiver;

public class Stereo {
  String location;

  public Stereo(String location) {this.location = location;}

  public void On() {System.out.println(location + " stereo is on"); }

  public void Off() {System.out.println(location + " stereo is off");}

  public void SetCD() {System.out.println(location + " stereo is set for CD input");}

  public void SetDVD() { System.out.println(location + " stereo is set for DVD input");}

  public void SetRadio() { System.out.println(location + " stereo is set for Radio"); }

  public void SetVolume(int volume) {
    // code to set the volume
    // valid range: 1-11 (after all 11 is better than 10, right?)
    System.out.println(location + " stereo volume set to " + volume);
  }
}
