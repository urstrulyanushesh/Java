package SocketProgramming.TCPSocket.BasicProgram;
import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try{
            System.out.println("Client Starts");
        Socket s=new Socket("localhost",3333);
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        dos.writeUTF("U see a Cypher,I see a Canteen!");
        dos.flush();
        dos.close();
        s.close();

        } catch (Exception e) {
            System.out.println("Error in Client part");
        }
    }
}
