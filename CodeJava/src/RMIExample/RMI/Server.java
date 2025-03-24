package RMIExample.RMI;
//Step 3:Implement Server

import java.rmi.*;
import java.net.*;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[] args) {
        try {
            Remote_Implement localObj=new Remote_Implement();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("Rem",localObj);

        } catch (RemoteException e) {
            System.out.println(e);
        }
        catch (MalformedURLException Me){
            System.out.println(Me);
        }
    }
}
