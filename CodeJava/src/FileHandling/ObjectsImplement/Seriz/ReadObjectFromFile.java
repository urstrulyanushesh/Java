package FileHandling.ObjectsImplement.Seriz;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjectFromFile {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream
                (new FileInputStream("person.txt"))) {
            Person person = (Person) ois.readObject();
            System.out.println("Object has been deserialized: " + person);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}