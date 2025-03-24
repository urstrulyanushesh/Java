package FileHandling;
import java.io.File;
// Importing FileNotFoundException class for handling errors  
import java.io.FileNotFoundException;
// Importing the Scanner class for reading text files  
import java.util.Scanner;

class CopyScanner {
    public static void main(String[] args) {
        try {
            // Create f1 object of the file to read data  
            File f1 = new File("C:\\Users\\user\\Desktop\\PFile" +
                    "\\JAVA\\CodeJava\\src\\FileHandling\\DupliFile.txt");
            Scanner sc = new Scanner(f1);
            while (sc.hasNextLine()) {
                String fileData = sc.nextLine();
                System.out.println(fileData);
            }
            sc.close();
        } catch (FileNotFoundException exception) {
            System.out.println("Unexpected error occurred!");
            exception.printStackTrace();
        }
    }
}  