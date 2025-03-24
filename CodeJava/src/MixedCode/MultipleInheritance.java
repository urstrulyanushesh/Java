package MixedCode;

interface A{
    void displayA();
}
interface B{
    void displayB();
}
public class MultipleInheritance implements A,B{
    public void displayA(){
        System.out.println("I am Display A");
    }
    public void displayB(){
        System.out.println("I am Display B");
    }
    public static void main(String[] args) {
        MultipleInheritance obj=new MultipleInheritance();
        obj.displayA();
        obj.displayB();
    }
}
