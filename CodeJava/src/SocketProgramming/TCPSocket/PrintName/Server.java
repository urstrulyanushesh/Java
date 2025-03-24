/*Program that asks client to enter a name, and it should be converted to uppercase in server and display
the converted name in client using socket programming.*/


package SocketProgramming.TCPSocket.PrintName;

import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) {
        try{
            System.out.println("Server Started");
            ServerSocket serverSocket=new ServerSocket(1234);
            Socket ss=serverSocket.accept();
            System.out.println("Connection Established");
            BufferedReader rd=new BufferedReader(new InputStreamReader(ss.getInputStream()));
            String name=rd.readLine();
            PrintWriter out=new PrintWriter(ss.getOutputStream(),true);
            out.println(name.toUpperCase());
            ss.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
