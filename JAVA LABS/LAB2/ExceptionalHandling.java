package LabReport;
import java.util.*;

class MyCheckedException extends Exception{
    public MyCheckedException(String msg){
        super(msg);
    }
}

public class ExceptionalHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks : ");
        int marks = sc.nextInt();
        try{
            errorMarks(marks);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            //System.out.println("Error");
        }
    }

    private static void errorMarks(int x) throws MyCheckedException{
        if(x>100 || x<0){
            throw new MyCheckedException("Invalid marks.");
        }

        System.out.println("Valid Marks");
    }
}
