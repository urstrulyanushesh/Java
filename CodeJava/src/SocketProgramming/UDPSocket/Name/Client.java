package SocketProgramming.UDPSocket.Name;

import java.net.*;
import java.util.*;
public class Client {
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            DatagramSocket ds=new DatagramSocket();
            //Sending Name TO Server
            System.out.print("Enter A Name:");
            String name=sc.nextLine();
            InetAddress inet=InetAddress.getByName("localhost");
            DatagramPacket dp=new DatagramPacket(name.getBytes(),name.length(),inet,7777);
            ds.send(dp);

            //Receiving Changed Name From Server
            byte []NewName=new byte[1024];
            DatagramPacket dpBack=new DatagramPacket(NewName,NewName.length);
            ds.receive(dpBack);
            String str=new String(dpBack.getData(),0,dpBack.getLength());
            System.out.println("NameIn UpperCase: "+str);

            ds.close();

        } catch (Exception e) {
            System.out.println("Error in Client"+e.getMessage());
        }
    }
}
