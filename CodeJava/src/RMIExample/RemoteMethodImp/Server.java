package RMIExample.RemoteMethodImp;


import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server
{
    public static void main(String args[])
    {
        try
        {
            ServerImplements s=new ServerImplements();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("SERVICE",s);
            System.out.println("Server Started ");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
