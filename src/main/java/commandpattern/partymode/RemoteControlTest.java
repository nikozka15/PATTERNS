package commandpattern.partymode;


import commandpattern.partymode.command.Command;
import commandpattern.partymode.command.HottubOffCommand;
import commandpattern.partymode.command.HottubOnCommand;
import commandpattern.partymode.command.LightOffCommand;
import commandpattern.partymode.command.LightOnCommand;
import commandpattern.partymode.command.MacroCommand;
import commandpattern.partymode.command.StereoOffCommand;
import commandpattern.partymode.command.StereoOnWithCDCommand;
import commandpattern.partymode.command.TVOffCommand;
import commandpattern.partymode.command.TVOnCommand;
import commandpattern.partymode.invoker.RemoteControl;
import commandpattern.partymode.receiver.Hottub;
import commandpattern.partymode.receiver.Light;
import commandpattern.partymode.receiver.Stereo;
import commandpattern.partymode.receiver.TV;

public class RemoteControlTest {
  public static void main(String[] args) {
    RemoteControl remoteControl = new RemoteControl();

    Light livingRoomLight = new Light("Living room");
    TV tv = new TV("Living room");
    Stereo stereo = new Stereo("Living room");
    Hottub hottub = new Hottub();

    LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
    LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
    StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
    StereoOffCommand stereoOff = new StereoOffCommand(stereo);
    TVOnCommand tvOn = new TVOnCommand(tv);
    TVOffCommand tvOff = new TVOffCommand(tv);
    HottubOnCommand hottubOn = new HottubOnCommand(hottub);
    HottubOffCommand hottubOff = new HottubOffCommand(hottub);

    Command[] partyOn = { livingRoomLightOn, stereoOnWithCD, tvOn, hottubOn};

    Command[] partyOff = { livingRoomLightOff, stereoOff, tvOff, hottubOff};

    MacroCommand partyOnMacro = new MacroCommand(partyOn);
    MacroCommand partyOffMacro = new MacroCommand(partyOff);
    remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

    System.out.println(remoteControl);
    System.out.println("--- Pushing Macro On---");
    remoteControl.onButtonWasPushed(0);
    System.out.println("--- Pushing Macro Off---");
    remoteControl.offButtonWasPushed(0);
    System.out.println("--- Pushing Macro Undo---");
    remoteControl.undoButtonWasPushed();

  }
}
