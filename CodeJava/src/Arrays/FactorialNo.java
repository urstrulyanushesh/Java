package Arrays;
import java.util.Scanner;

public class FactorialNo {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the no to find Factorial:");
        int num=input.nextInt();
        int result=factorialCode(num);
        System.out.print("Factorial :" + result);
    }
    public static int factorialCode(int num){
        if(num==0 || num==1){
            return 1;
        }             int i=2;
            int prod=1;
            while(num>=i){
                 prod *= i;
                i++;
            }
            return prod;
    }
}
