
import java.rmi.*;
import java.lang.*;
import java.util.*;

public class Client
{
public static void main(String args[])
{
        Scanner input=new Scanner(System.in);
        System.out.println("Enter First Number:");
        int first=input.nextInt();
        System.out.println("Enter Second Number:");
        int second=input.nextInt();

try
{
String ip="rmi://127.0.0.1/SERVICE";
RemoteInterface s=
(RemoteInterface)Naming.lookup(ip);
System.out.println("sum: "+ s.add(first,second));
}
catch(Exception e)
{
System.out.println(e.getMessage());
e.printStackTrace();
}
}
}