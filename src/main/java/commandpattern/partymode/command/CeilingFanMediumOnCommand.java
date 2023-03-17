package commandpattern.partymode.command;


import commandpattern.partymode.receiver.CeilingFan;

public class CeilingFanMediumOnCommand implements Command {
  CeilingFan ceilingFan;
  int previousSpeed;

  public CeilingFanMediumOnCommand(CeilingFan ceilingFan)
  {
    this.ceilingFan = ceilingFan;
  }
  @Override
  public void execute() {
      ceilingFan.medium();
  }

  @Override
  public void undo() {
    if (previousSpeed == CeilingFan.high) {
      ceilingFan.high();
    } else if (previousSpeed == CeilingFan.medium) {
      ceilingFan.medium();
    } else if (previousSpeed == CeilingFan.low) {
      ceilingFan.low();
    } else if (previousSpeed == CeilingFan.off) {
      ceilingFan.off();
    }
  }
}
