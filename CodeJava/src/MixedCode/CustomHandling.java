package MixedCode;

import java.util.Scanner;
public class CustomHandling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Age:");
        try {
        int age=sc.nextInt();
            if (age < 18) {
                throw new MyException("Error Error");
            }
            else{
                System.out.println("Age=="+age);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

class MyException extends Exception{
    public MyException(String message) {
        super(message);
    }
}
