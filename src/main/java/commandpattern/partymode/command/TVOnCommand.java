package commandpattern.partymode.command;


import commandpattern.partymode.receiver.TV;

public class TVOnCommand implements Command {
  TV tv;
  int previousVolume;
  int previousChanel;


  public TVOnCommand(TV tv) {
    this.tv = tv;
  }

  @Override
  public void execute() {
    tv.on();
    tv.setMusicChanel();
    tv.setNormalVolume();
  }

  @Override
  public void undo() {
    tv.off();
  }
}
