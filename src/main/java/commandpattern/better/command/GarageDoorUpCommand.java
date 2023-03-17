package commandpattern.better.command;

import commandpattern.better.receiver.GarageDoor;

public class GarageDoorUpCommand implements Command {
  GarageDoor garageDoor;

  public GarageDoorUpCommand(GarageDoor garageDoor) {
    this.garageDoor = garageDoor;
  }

  @Override
  public void execute() {
    garageDoor.up();
  }

  @Override
  public void undo() {

  }
}
