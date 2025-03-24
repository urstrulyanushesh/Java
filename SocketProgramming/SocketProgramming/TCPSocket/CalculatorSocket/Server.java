package SocketProgramming.TCPSocket.CalculatorSocket;

import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) {
        try{
            System.out.println("Server Started...");
            ServerSocket serSoc=new ServerSocket(4455);
            Socket s=serSoc.accept();
            System.out.println("Connection Established...");
            PrintWriter out=new PrintWriter(s.getOutputStream(),true);
            BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
            String first=br.readLine();
            String second=br.readLine();
            int firstNum=Integer.parseInt(first);
            int secondNum=Integer.parseInt(second);

//            Tala ko process lai break gareko ho comment ma
//            int add=firstNum+secondNum;
//            int subt=firstNum-secondNum;
//            int mult=firstNum*secondNum;
//            out.println(add);
//            out.println(subt);
//            out.println(mult);

            out.println(firstNum + secondNum); // Addition
            out.println(firstNum - secondNum); // Subtraction
            out.println(firstNum * secondNum); // Multiplication
            serSoc.close();

        } catch (Exception e) {
            System.out.println("Error Occurred in Server: " + e.getMessage());
        }
    }
}
