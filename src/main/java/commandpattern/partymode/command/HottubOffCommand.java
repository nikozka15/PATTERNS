package commandpattern.partymode.command;


import commandpattern.partymode.receiver.Hottub;

public class HottubOffCommand implements Command{
  Hottub hottub;

  public HottubOffCommand(Hottub hottub) {
    this.hottub = hottub;
  }

  @Override
  public void execute() {
    hottub.cool();
    hottub.bubblesOff();
  }

  @Override
  public void undo() {
    hottub.heat();
    hottub.bubblesOn();
  }
}
