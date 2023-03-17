package commandpattern.simple;

import commandpattern.simple.invoker.SimpleRemoteControl;
import commandpattern.simple.receiver.GarageDoor;
import commandpattern.simple.receiver.Light;

public class RemoteControlTest {
  public static void main(String[] args) {
    SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();


    simpleRemoteControl.setCommand(()-> new Light().on());
    simpleRemoteControl.buttonWasPressed();



    GarageDoor garageDoor = new GarageDoor();
    simpleRemoteControl.setCommand(() -> garageDoor.up());
    simpleRemoteControl.buttonWasPressed();




  }
}
