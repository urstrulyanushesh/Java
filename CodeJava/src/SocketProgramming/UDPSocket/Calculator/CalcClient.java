package SocketProgramming.UDPSocket.Calculator;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.util.Scanner;

public class CalcClient {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            InetAddress ip = InetAddress.getByName("localhost");
            DatagramSocket ds = new DatagramSocket();

            System.out.print("Enter First Num: ");
            int first = sc.nextInt();
            System.out.print("Enter Second Num: ");
            int second = sc.nextInt();

            // Create a ByteBuffer to hold the two integers
            ByteBuffer buffer = ByteBuffer.allocate(8); // 4 bytes for each integer
            buffer.putInt(first);
            buffer.putInt(second);

            byte[] byteArray = buffer.array(); // Get the byte array

            // Create and send the DatagramPacket
            DatagramPacket dp = new DatagramPacket(byteArray, byteArray.length, ip, 8989);
            ds.send(dp);

            // Prepare to receive results from server
            byte[] resultBuffer = new byte[1024]; // Buffer for receiving results
            DatagramPacket resultPacket = new DatagramPacket(resultBuffer, resultBuffer.length);

            // Receive results from server
            ds.receive(resultPacket);

            // Convert received bytes to string and print results
            String resultMessage = new String(resultPacket.getData(), 0, resultPacket.getLength());
            System.out.println("Results from Server: " + resultMessage);

            ds.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
