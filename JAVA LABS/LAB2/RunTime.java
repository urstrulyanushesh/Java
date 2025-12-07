package LabReport;
import java.util.*;

class MyException extends RuntimeException{
    public MyException(String msg){
        super(msg);
    }
}

public class RunTime{
    public static void main(String[] args) {
        try{
            checkedNumber(-22);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        try{
            checkedNumber(16);
        }
        catch(Exception e){
            System.out.println("This is invalid number"+e.getMessage());
        }
    }
    private static void checkedNumber(int x)throws MyException{
        if(x < 0){
            throw new MyException("Less than zero");
        }
        else{
            System.out.println("More than Zero");
        }
    }
}