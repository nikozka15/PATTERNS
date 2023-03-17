package listener.angeldevil;

import javax.swing.*;
import java.awt.*;

public class SwingObserverExample {
  JFrame jFrame;
  public static void main(String[] args) {
    SwingObserverExample swingObserverExample = new SwingObserverExample();
    swingObserverExample.go();
  }
  public void go(){
    jFrame = new JFrame();
    JButton button = new JButton("Should I do it?");
    button.addActionListener(new AngelListener());
    button.addActionListener(new DevilListener());
    jFrame.getContentPane().add(BorderLayout.CENTER, button);
    jFrame.setVisible(true);
    jFrame.setSize(400,150);
  }
}
