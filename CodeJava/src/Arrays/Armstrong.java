package Arrays;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to Check Armstrong: ");
        int num = input.nextInt();
        boolean arm=armstrong(num);
        if(arm) {
            System.out.print("Yes Its ArmStrong");
        } else{
            System.out.print("No Not ArmStrong");
        }
    }

    public static boolean armstrong(int num){
        int temp=num;
        int originalData=num;
        int count=0,val;
        double sum=0;
        while(num>0){
            count++;
            num/=10;
        }

        while(temp>0){
        val=temp%10;
        sum+= Math.pow(val,count);
        temp=temp/10;
        }

        return sum==originalData;
    }



    }
