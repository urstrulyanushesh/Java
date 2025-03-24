package OOPsPrinciple;

class OuterClass{
    public void print(){
        System.out.println("I am outer class");
    }
}

public class AnonymousClass {
    public static void main(String[] args) {
        OuterClass obj=new OuterClass();
        obj.print();

        OuterClass an=new OuterClass(){
        public void print(){
            System.out.println("I am Anonymous Class");
        }
        };
        an.print();
    }

}
