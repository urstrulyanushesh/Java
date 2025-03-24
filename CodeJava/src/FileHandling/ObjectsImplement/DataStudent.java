package FileHandling.ObjectsImplement;

import java.io.*;

public class DataStudent {
    public static void main(String[] args) {
        // Define the file path with a .ser extension for serialized data
        File file = new File("C:\\Users\\user\\Desktop\\PFile\\JAVA\\CodeJava\\src\\FileHandling\\Student.txt");

        // Deserialize the Student object from the file
        try (ObjectInputStream objIn = new ObjectInputStream(new FileInputStream(file))) {
            Student student = (Student) objIn.readObject(); // Read the serialized object
            System.out.println(student); // Print the deserialized object
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace(); // Print stack trace for debugging purposes
        }
    }
}
