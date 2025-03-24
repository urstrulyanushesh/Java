package Arrays;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter The No to Find Day: ");
    int day= input.nextInt();
    String WeekDay=switch(day){
        case 1 -> "Sunday";
        case 2 -> "Monday";
        case 3 -> "Tuesday";
        case 4 -> "Wednesday";
        case 5 -> "Thursday";
        case 6 -> "Friday";
        case 7 -> "Saturday";
        default -> "Holiday";
    };
        System.out.println(WeekDay);
    }
}
