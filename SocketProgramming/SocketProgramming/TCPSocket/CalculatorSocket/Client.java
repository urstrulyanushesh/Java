package SocketProgramming.TCPSocket.CalculatorSocket;

import java.net.*;
import java.io.*;
import java.util.*;

public class Client {
    public static void main(String[] args) {
        try{
            Scanner scanner=new Scanner(System.in);
            Socket s=new Socket("localhost",4455);
            PrintWriter out=new PrintWriter(s.getOutputStream(),true);
            BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
            System.out.print("Enter First Num:");
            int first=scanner.nextInt();
            out.println(first);
            System.out.print("Enter Second Num:");
            int second=scanner.nextInt();
            out.println(second);

//            String add=br.readLine();
//            int addition=Integer.parseInt(add);
//            System.out.println("Addition:"+addition);
//            String subt=br.readLine();
//            int subtract=Integer.parseInt(subt);
//            System.out.println("Subtraction:"+subtract);
//            String mult=br.readLine();
//            int multiply=Integer.parseInt(mult);
//            System.out.println("Multiplication:"+multiply);
//            tala ko 3 line ko code break gareko xa mathi


            System.out.println("Addition: " + br.readLine());
            System.out.println("Subtraction: " + br.readLine());
            System.out.println("Multiplication: " + br.readLine());



            s.close();

        } catch (Exception e) {
            System.out.println("Error Occurred in Client Side: " + e.getMessage());
        }
    }
}
