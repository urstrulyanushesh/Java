package SocketProgramming.TCPSocket.ChatApp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientChat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            Socket s=new Socket("localhost",9999);
            System.out.println("Client Side Started...");
            PrintWriter pwr=new PrintWriter(s.getOutputStream(),true);
            BufferedReader read=new BufferedReader(new InputStreamReader(s.getInputStream()));

            while(true){

            System.out.print("\nClient Msg:");
            String msg=sc.nextLine();
            if (msg.equalsIgnoreCase("bye")) {  //If Client Msg Bye Disconnect
                    pwr.println(msg);
                System.out.println("\nClient Exited...");
                    break;
            }
            pwr.println(msg);//Sending To Server

            String getMsg= read.readLine();//receiving From Server
            if (getMsg != null) {
                System.out.println("\nServer Msg: " + getMsg);
            }

            if (getMsg.equalsIgnoreCase("bye")) {//After receiving bye from server
                System.out.println("\nServer disconnected.");
                break;
            }


            }
            s.close();

        } catch (Exception e) {
            System.out.println("Error in Client Side:"+e.getMessage());
        }

    }
}
