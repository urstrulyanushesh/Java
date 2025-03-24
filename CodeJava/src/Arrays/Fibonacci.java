package Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number up to which you want to find the Fibonacci sequence: ");
        int num = input.nextInt();
        fibonacci(num);
    }

    public static void fibonacci(int num) {
        if (num < 0) {
            System.out.println("Invalid input. Please enter a non-negative number.");
            return;
        }
        if (num == 0) {
            System.out.println("1");
            return;
        }

        int first = 0;
        int second = 1;

        System.out.print("Fibonacci sequence up to " + num + ": " + first);

        while (second <= num) {
            System.out.print(", " + second);
            int third = first + second;
            first = second;
            second = third;
        }
    }
}
