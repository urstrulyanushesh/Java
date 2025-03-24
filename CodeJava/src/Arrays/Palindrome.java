package Arrays;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Num to Check Palindrome: ");
        int num = input.nextInt();
        boolean isPalindrome = findPalindrome(num);

        if (isPalindrome) {
            System.out.println("It is palindrome");
        } else {
            System.out.println("It is not palindrome");
        }
    }

    public static boolean findPalindrome(int num) {
        int originalNum = num; // Store the original number
        long reversedNum = 0; // Variable to store the reversed number
        int digit;

        // Reverse the number
        while (num > 0) {
            digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num = num / 10;
        }

        // Check if the original number is equal to the reversed number
        return originalNum == reversedNum;
    }
}
