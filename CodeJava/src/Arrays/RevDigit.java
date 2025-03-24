package Arrays;
import java.util.Scanner;
public class RevDigit {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the Num to Find Its Reverse: ");
        long num=input.nextLong();
        long val=findReverse(num);
        System.out.print("Its Reverse :::" + val);
    }

    public static long findReverse(long num){
        long sum=0;
        long digit;
        while(num>0){
            digit=num%10;
            sum=sum*10+digit;
            num=num/10;
        }
        return  sum;
    }
}
