package RMIExample.RMI;

//Step 1:Define Remote Interface
import java.rmi.*;
public interface Rem extends Remote{
    int add(int x,int y)throws RemoteException;
}

