package Arrays;
import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter 1st no:");
        int num1 =input.nextInt();
        System.out.print("Enter 2nd no:");
        int num2 =input.nextInt();
        int result=multiple(num1,num2);
        System.out.print("LCM :" + result);
    }

    public static int multiple(int num1,int num2) {
        int i=1;
        while(true){
        int factor=num1*i;
        if(factor % num2 ==0) {
            return factor;
        }
            i++;
        }
    }
}
