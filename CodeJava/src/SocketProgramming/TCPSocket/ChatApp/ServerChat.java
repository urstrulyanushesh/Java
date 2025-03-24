package SocketProgramming.TCPSocket.ChatApp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerChat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            ServerSocket ssocket=new ServerSocket(9999);
            System.out.println("Server has been started...");
            Socket s=ssocket.accept();
            System.out.println("Connected To Server...");
            PrintWriter pwr=new PrintWriter(s.getOutputStream(),true);
            BufferedReader read=new BufferedReader(new InputStreamReader(s.getInputStream()));


            while (true) {
                String getMsg = read.readLine();//Getting Msg From Client
                if (getMsg != null) {
                    System.out.println("\nClient Msg: " + getMsg);
                }
                if (getMsg.equalsIgnoreCase("bye")) {//After receiving bye from client
                    System.out.println("\nClient disconnected.");
                    break;
                }

                System.out.print("\nServer Msg:");
                String serMsg = sc.nextLine();
                if (serMsg.equalsIgnoreCase("bye")) {//If server Msg Bye
                    pwr.println(serMsg);
                    System.out.println("\nServer Exited");
                    break;
                }
                pwr.println(serMsg);//Sending TO Client

            }
                ssocket.close();
        } catch (Exception e) {
            System.out.println("Error in Server:"+e.getMessage());
        }
    }
}
