package FileHandling.ObjectsImplement.Seriz;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjectToFile {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 30);

        try (ObjectOutputStream oos = new ObjectOutputStream
                (new FileOutputStream("person.txt"))) {
            oos.writeObject(person);
            System.out.println("Object has been serialized and written to person.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
