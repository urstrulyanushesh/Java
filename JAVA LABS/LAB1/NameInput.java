import java.util.*;

public class NameInput{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = scan.nextLine();
		System.out.println("The name in UpperCase is : "+ name.toUpperCase());
	}
}