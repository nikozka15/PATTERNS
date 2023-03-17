package commandpattern.partymode.command;


import commandpattern.partymode.receiver.Hottub;

public class HottubOnCommand implements Command{
  Hottub hottub;
   public HottubOnCommand(Hottub hottub) {
    this.hottub = hottub;
  }

  @Override
  public void execute() {
    hottub.heat();
    hottub.bubblesOn();
  }

  @Override
  public void undo() {
    hottub.cool();
    hottub.bubblesOff();

  }
}
