import java.util.*;

class User{
	String name;
	String address;
	int age;
	String email;

	User(String name, String address, String email, int age){
		this.name = name;
		this.address = address;
		this.email = email;
		this.age = age;
	}
}

public class CreateClass{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name1 = scan.nextLine();

		System.out.println("Enter your age : ");
		int age1 = scan.nextInt();
		scan.nextLine();

		System.out.println("Enter your address : ");
		String address1 = scan.nextLine();

		System.out.println("Enter your email : ");
		String email1 = scan.nextLine();

		User user = new User(name1,address1,email1,age1);

		// Displaying the initialized value
		System.out.println();
		System.out.println("Here is the Information : ");
		System.out.println("Name : "+user.name);

		System.out.println("Age : "+user.age);

		System.out.println("Address : "+user.address);

		System.out.println("Email : "+user.email);
	}
}