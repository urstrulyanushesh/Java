package FileHandling;

import java.io.*;

public class Reading {
    public static void main(String[] args) {
        try{
            FileReader input=new FileReader("C:\\Users\\user\\Desktop\\PFile\\JAVA\\CodeJava\\src\\FileHandling\\write.txt");
            int i;
            while((i=input.read())!=-1) {
                System.out.print((char)i);
            }
                input.close();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
