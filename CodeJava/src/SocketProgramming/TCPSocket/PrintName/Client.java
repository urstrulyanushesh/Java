/*Program that asks client to enter a name, and it should be converted to uppercase in server and display
the converted name in client using socket programming.*/


package SocketProgramming.TCPSocket.PrintName;

import java.net.*;
import java.io.*;
import java.util.*;


public class Client {
    public static void main(String[] args) {
        try{
            Socket soc=new Socket("localhost",1234);
            BufferedReader rd=new BufferedReader(new InputStreamReader(soc.getInputStream()));
            PrintWriter out=new PrintWriter(soc.getOutputStream(),true);
            System.out.print("Enter Your Name:");
            Scanner sc=new Scanner(System.in);
            String name=sc.nextLine();
            out.println(name);
            String ConvertedName=rd.readLine();
            System.out.println("Name in UpperCase:"+ConvertedName);
            soc.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
