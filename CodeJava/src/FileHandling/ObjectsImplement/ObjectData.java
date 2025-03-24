package FileHandling.ObjectsImplement;

import java.io.*;

class Student implements Serializable {
    // Fields of the Student class
    int rollNo;
    String name;

    // Constructor to initialize the fields
    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // Override toString method to provide a string representation of the object
    @Override
    public String toString() {
        return rollNo + " " + name;
    }
}

public class ObjectData {
    public static void main(String[] args) {
        // Define the file path with a .ser extension for serialization
        File file = new File("C:\\Users\\user\\Desktop\\PFile\\JAVA\\CodeJava\\src\\FileHandling\\Student.txt");

        // Create a Student object
        Student student = new Student(101, "John");
        System.out.println(student); // Print the Student object to console

        // Serialize the Student object to the file
        try (ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream(file))) {
            objOut.writeObject(student); // Write the Student object to the file
        } catch (IOException e) {
            e.printStackTrace(); // Print any IO exception that occurs
        }
    }
}
