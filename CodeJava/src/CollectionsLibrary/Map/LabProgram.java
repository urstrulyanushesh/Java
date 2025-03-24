package CollectionsLibrary.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter input (" + (i + 1) + "): ");
            String input = sc.nextLine();
            String[] parts = input.split(":");

            if (parts.length == 2) {
                String animalType = parts[0].trim();
                String animalName = parts[1].trim();
                map.put(animalType, animalName);
            } else {
                System.out.println("Wrong Input. Please use the format animal_type:animal_name.");
                i--; // Decrement i to repeat the input for this iteration
            }
        }

        // Display the stored pets
        System.out.println("\nYou have entered the following pets:");
        for (String key : map.keySet()) {
            System.out.println("Animal Type: " + key + ", Animal Name: " + map.get(key));
        }

    }
}
