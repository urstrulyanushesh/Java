package SocketProgramming.UDPSocket.Calculator;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.nio.ByteBuffer;

public class CalcServer {
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket(8989);
            System.out.println("Server is ready...");

            // Buffer to receive data
            byte[] buffer = new byte[8];
            DatagramPacket dp = new DatagramPacket(buffer, buffer.length);

            // Receive two integers from the client
            ds.receive(dp);
            ByteBuffer byteBuffer = ByteBuffer.wrap(dp.getData());
            int firstNum = byteBuffer.getInt();
            int secondNum = byteBuffer.getInt();

            // Perform calculations
            int sum = firstNum + secondNum;
            int difference = firstNum - secondNum;
            int product = firstNum * secondNum;

            // Prepare result message
            String resultMessage = "Sum: " + sum + ", Difference: " + difference + ", Product: " + product;
            byte[] resultBytes = resultMessage.getBytes();

            // Send results back to the client
            DatagramPacket resultPacket = new DatagramPacket(resultBytes, resultBytes.length, dp.getAddress(), dp.getPort());
            ds.send(resultPacket);

            ds.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}