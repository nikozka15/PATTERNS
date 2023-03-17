package listener.angeldevil;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AngelListener implements ActionListener {
  @Override
  public void actionPerformed(ActionEvent actionEvent) {
    System.out.println("Don’t do it, you might regret it!");
  }
}
