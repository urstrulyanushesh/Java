package SocketProgramming.TCPSocket.BasicProgram;
import java.io.*;
import java.net.*;
public class Server {
    public static void main(String[] args) {
        try{
            System.out.println("Waiting for Clients...");
            ServerSocket serversocket=new ServerSocket(3333);
            Socket skt=serversocket.accept();
            System.out.println("Connection Established");
            DataInputStream dis=new DataInputStream(skt.getInputStream());
            String str=(String)dis.readUTF();
            System.out.println(str);
            serversocket.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
