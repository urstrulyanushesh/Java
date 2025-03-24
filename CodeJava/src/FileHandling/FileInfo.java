package FileHandling;

import java.io.File;


public class FileInfo {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\user\\Desktop\\PFile\\JAVA\\CodeJava\\src\\FileHandling\\NewFile.txt");
            if (f.exists()) {
                System.out.println("File Already Exists");
                System.out.println("FileName: " + f.getName());
                System.out.println("FilePath: " + f.getAbsolutePath());
                System.out.println("File Writeable: " + f.canWrite());
                System.out.println("File Readable: " + f.canRead());
                System.out.println("FileLength: " + f.length());
            } else {
                System.out.println("File couldn't created");
            }
    }
}