package Arrays;
import java.util.Scanner;

public class SumOfNo {
    public static void main(String[] args) {
            Scanner input= new Scanner(System.in);
            System.out.print("Enter the no to find its Sum:"); //63 sum is 6+3=9
            int num=input.nextInt();
            int result=sumCode(num);
            System.out.print("Sum :" + result);
    }

    public static int sumCode( int num) {
    int sum=0;
    while(num>0){
        sum+= num%10;
        num=num/10;
    }
    return sum;
    }
}
