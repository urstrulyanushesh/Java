class A{
	public A(){
		System.out.println("This is a Parent Class");
	}
}

class B extends A{
	public B(){
		System.out.println("This is Child Class");
	}
}

public class WithoutSuper{
	public static void main(String []args){
		B obj = new B();
	}
}