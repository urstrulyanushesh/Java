package SocketProgramming.UDPSocket.Name;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Server {
    public static void main(String[] args) {
        try{
            DatagramSocket ds=new DatagramSocket(7777);
            System.out.println("Server is Ready");
            //Receiving Name from a Client
            byte []name=new byte[1024];
            DatagramPacket dp=new DatagramPacket(name,name.length);
            ds.receive(dp);
            String str=new String(dp.getData(),0,dp.getLength());

            String nameChange=str.toUpperCase();//Changing Name to UpperCase

            //Sending Name TO The Client Back After Modification
            InetAddress i=InetAddress.getByName("localhost");
            DatagramPacket dpPac=new DatagramPacket(nameChange.getBytes(),nameChange.length(),i,dp.getPort());
            ds.send(dpPac);
            ds.close();

        } catch (Exception e) {
            System.out.println("Error in Server"+e.getMessage());
        }
    }
}
