package commandpattern.partymode.command;


import commandpattern.partymode.receiver.Stereo;

public class StereoOnWithCDCommand implements Command {
  Stereo stereo;

  public StereoOnWithCDCommand(Stereo stereo) {
    this.stereo = stereo;
  }

  @Override
  public void execute() {
    stereo.On();
    stereo.SetCD();
    stereo.SetVolume(5);
  }

  @Override
  public void undo() {
    stereo.Off();
  }
}
