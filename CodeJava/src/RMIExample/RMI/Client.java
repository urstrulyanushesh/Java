package RMIExample.RMI;
//Step 4:Implement client

import java.rmi.*;
import java.net.*;
import java.util.*;

public class Client {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter First Number:");
        int first=input.nextInt();
        System.out.println("Enter Second Number:");
        int second=input.nextInt();


        try{
            Rem remObj=(Rem)Naming.lookup("rmi://localhost/Rem");
            System.out.println("Sum Numbers= "+remObj.add(first,second));
        }
        catch (RemoteException e) {
            System.out.println(e);
        }

        catch (NotBoundException Ne) {
            System.out.println(Ne);
        }
        catch (MalformedURLException Me) {
            System.out.println(Me);
        }
    }
}
