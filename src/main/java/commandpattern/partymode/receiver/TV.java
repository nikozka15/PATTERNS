package commandpattern.partymode.receiver;

public class TV {
  String location;
  int chanel;
  int musicChanel = 5;
  int volume;
  int normalVolume = 30;
  public TV(String location) { this.location = location;}

  public void on(){
    System.out.println("TV is turned on.");
  }
  public void off(){System.out.println("TV is turned off.");}
  public int setChannel(int chanel){
    this.chanel = chanel;
  return chanel;
  }
  public int setMusicChanel() {
    chanel = musicChanel;
    System.out.println("Music chanel is turned");
    return chanel;
  }
  public int setNormalVolume() {
    volume = normalVolume;
    return volume;
  }
  public int setVolume(int volume){
    this.volume = volume;
  return volume;
  }

  public int getChanel() {
    return chanel;
  }

  public int getVolume() {
    return volume;
  }
}
