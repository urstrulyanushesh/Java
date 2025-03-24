package Arrays;

import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter No of Elements: ");
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element [" + i + "]: ");
            array[i] = input.nextInt();
        }
        return array;
    }

    public static void displayArray(int[] array) {

        System.out.println("Array elements:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element [" + i + "]: " + array[i]);
        }
        System.out.println();
    }
}
