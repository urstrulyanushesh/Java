package CollectionsLibrary.Enums;

import java.util.Scanner;

enum Series {
    GOT, BREAKING_BAD, DARK, FRIENDS
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Available series: ");
        for (Series val : Series.values()) {
            System.out.print(val + " ");
        }
        System.out.println("\nSelect a series:");

        String input = sc.nextLine().toUpperCase(); // Convert input to uppercase for matching

        try {
            Series ser = Series.valueOf(input);
            switch (ser) {
                case GOT:
                    System.out.println("Game of Thrones selected");
                    break;
                case BREAKING_BAD:
                    System.out.println("Breaking Bad selected");
                    break;
                case DARK:
                    System.out.println("Dark selected");
                    break;
                case FRIENDS:
                    System.out.println("Friends selected");
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Please choose from the available options only.");
        }
    }
}
