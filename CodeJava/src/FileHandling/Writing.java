package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class Writing {
    public static void main(String[] args) {
        String data="Hello Intellij IDE. I am a programmer....";
        try{
            FileWriter f = new FileWriter("C:\\Users\\user\\Desktop\\PFile\\JAVA\\CodeJava\\src\\FileHandling\\write.txt");
            f.write(data);
            f.close();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
