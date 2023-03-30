package proxy.gumballmachine.remote;

import java.rmi.Remote;

public interface MyRemote extends Remote {
  String sayHello() throws Exception;
}
