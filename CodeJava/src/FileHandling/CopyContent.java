package FileHandling;

import java.io.*;
import java.util.Scanner;

public class CopyContent {
    public static void main(String[] args) throws IOException {
        FileInputStream org=new FileInputStream("C:\\Users\\user\\Desktop\\PFile" +
                "\\JAVA\\CodeJava\\src\\FileHandling\\NewFile.txt");
        FileOutputStream dupli=new FileOutputStream("C:\\Users\\user\\Desktop\\PFile" +
                "\\JAVA\\CodeJava\\src\\FileHandling\\DupliFile.txt");

        int i;
        while((i=org.read())!=-1){
            dupli.write((char)i);
        }


        System.out.println("Data Copied");


    }
}
