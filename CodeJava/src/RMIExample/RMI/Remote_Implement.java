package RMIExample.RMI;
//Step 2:Implementing Remote Interface

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class Remote_Implement extends UnicastRemoteObject implements Rem{
    public Remote_Implement()throws RemoteException{}


    @Override
    public int add(int x, int y)throws RemoteException{
       return (x+y);
    }
}
