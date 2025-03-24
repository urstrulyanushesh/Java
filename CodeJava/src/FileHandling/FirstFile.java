package FileHandling;

import java.io.File;
import java.io.IOException;

public class FirstFile {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\user\\Desktop\\PFile\\JAVA\\CodeJava\\src\\FileHandling\\NewFile.txt");
        try {
            if (f.createNewFile()) {
                System.out.println("New File Has Been Created!");
            }  else {
                System.out.println("File Already Exists");
            }
        } catch (IOException e) {
            System.out.println("Error Handled");
        }
    }
}