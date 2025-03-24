package Arrays;
import java.util.Scanner;

public class ArraySumAvg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter No of Elements: ");
        int size = input.nextInt();
        int[] array = new int[size];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element [" + i + "]: ");
            array[i] = input.nextInt();
            sum += array[i];
        }

        System.out.println("Array elements:");
        for (int i = 0; i < size; i++) {
            System.out.println("Element [" + i + "]: " + array[i]);
        }

        double avg = (double) sum / size;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
    }
}
