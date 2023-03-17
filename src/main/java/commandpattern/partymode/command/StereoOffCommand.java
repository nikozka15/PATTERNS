package commandpattern.partymode.command;


import commandpattern.partymode.receiver.Stereo;

public class StereoOffCommand implements Command{
  Stereo stereo;

  public StereoOffCommand(Stereo stereo) {
    this.stereo = stereo;
  }

  @Override
  public void execute() {
   stereo.Off();
  }

  @Override
  public void undo() {
    stereo.On();
    stereo.SetVolume(5);
    stereo.SetCD();
  }
}
