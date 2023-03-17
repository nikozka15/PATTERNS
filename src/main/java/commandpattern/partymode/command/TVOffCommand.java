package commandpattern.partymode.command;


import commandpattern.partymode.receiver.TV;

public class TVOffCommand implements Command{
  TV tv;
  int previousVolume;
  int previousChanel;


  public TVOffCommand(TV tv) {
    this.tv = tv;
  }

  @Override
  public void execute() {
    previousChanel = tv.getChanel();
    previousVolume = tv.getVolume();
    tv.off();

  }

  @Override
  public void undo() {
    tv.on();
    tv.setChannel(previousChanel);
    tv.setVolume(previousVolume);
  }
}
