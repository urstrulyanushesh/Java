package Arrays;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
     System.out.print("Enter Your Name:");
     Scanner input=new Scanner(System.in);
     String name=input.nextLine();
     System.out.print("Welcome " +  name + " To The Coding:");
    }
}
