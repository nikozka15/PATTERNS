package commandpattern.partymode.command;


import commandpattern.partymode.receiver.CeilingFan;

public class CeilingFanOffCommand implements Command {
  CeilingFan ceilingFan;
  int previousSpeed;

  public CeilingFanOffCommand(CeilingFan ceilingFan) {
    this.ceilingFan = ceilingFan;
  }

  @Override
  public void execute() {
    previousSpeed = ceilingFan.GetSpeed();
    ceilingFan.off();
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
