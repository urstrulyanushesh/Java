
import java.rmi.*;
import java.rmi.server.*;

public class ServerImplements extends UnicastRemoteObject implements RemoteInterface
{
public ServerImplements()throws RemoteException
{
super();
}
public int add(int x,int y)
{
return (x+y);
}
}