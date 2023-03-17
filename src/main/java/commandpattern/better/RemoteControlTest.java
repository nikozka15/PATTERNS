package commandpattern.better;

import commandpattern.better.invoker.RemoteControl;

public class RemoteControlTest {
  public static void main(String[] args) {
    RemoteControl remoteControl = new RemoteControl();

//    Light livingRoomLight = new Light("Living room");
//    Light kitchenLight = new Light("Kitchen");
//    CeilingFan ceilingFan = new CeilingFan("Living room");
//    GarageDoor garageDoor = new GarageDoor("");
//    Stereo stereo = new Stereo("Living room");
//
//    LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
//    LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
//    LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
//    LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
//
//    CeilingFanMediumOnCommand ceilingFanOn = new CeilingFanMediumOnCommand(ceilingFan);
//    CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
//    GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
//    GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);
//    StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
//    StereoOffCommand stereoOff = new StereoOffCommand(stereo);
//
//
//    remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
//    remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
//    remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
//    remoteControl.setCommand(3, garageDoorUp, garageDoorDown);
//    remoteControl.setCommand(4, stereoOnWithCD, stereoOff);
//
  //  System.out.println(remoteControl);

//    remoteControl.onButtonWasPushed(0);
//    remoteControl.offButtonWasPushed(0);
//    remoteControl.onButtonWasPushed(1);
//    remoteControl.offButtonWasPushed(1);
//    remoteControl.onButtonWasPushed(2);
//    remoteControl.offButtonWasPushed(2);
//    remoteControl.onButtonWasPushed(3);
//    remoteControl.offButtonWasPushed(3);
//    remoteControl.onButtonWasPushed(4);
//    remoteControl.offButtonWasPushed(4);

// Test of Undo Button

//    remoteControl.onButtonWasPushed(1);
//    remoteControl.offButtonWasPushed(1);
//     System.out.println(remoteControl);
//    remoteControl.undoButtonWasPushed();
//    remoteControl.offButtonWasPushed(1);
//    remoteControl.onButtonWasPushed(1);
//    System.out.println(remoteControl);
//    remoteControl.undoButtonWasPushed();

// Ceiling fan Medium High Off Undo
//   CeilingFan ceilingFan = new CeilingFan("Living Room");
//
//    // CeilingFanMediumOnCommand ceilingFanMedium = new CeilingFanMediumOnCommand(ceilingFan);
//    CeilingFanHighOnCommand ceilingFanHigh = new CeilingFanHighOnCommand(ceilingFan);
//    CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
//
//    remoteControl.setCommand(0, new CeilingFanMediumOnCommand(ceilingFan), ceilingFanOff);
//    remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);
//
//    remoteControl.onButtonWasPushed(0);
//    remoteControl.offButtonWasPushed(0);
//    System.out.println(remoteControl);
//    remoteControl.undoButtonWasPushed();
//
//    remoteControl.onButtonWasPushed(1);
//    System.out.println(remoteControl);
//    remoteControl.undoButtonWasPushed();
  }
}
