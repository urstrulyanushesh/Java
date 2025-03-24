package Arrays;

import java.util.Scanner;

public class AddNo {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter The First Num:");
        int first=input.nextInt();
        System.out.print("Enter The Second Num:");
        int second=input.nextInt();
        int sum=first+second;
        System.out.print("Sum==="+sum);
    }
}
