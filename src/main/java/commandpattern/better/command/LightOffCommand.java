package commandpattern.better.command;

import commandpattern.better.receiver.Light;

public class LightOffCommand implements Command {
  Light light;

  public LightOffCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.off();
  }

  @Override
  public void undo() {
    light.on();
  }
}
