package LabReport;

interface A{
    void work();
}

interface B{
    void show();
}

class C implements A,B{
    public void work(){
        System.out.println("This is from Interface A");
    }

    public void show(){
        System.out.println("This is from Interface B");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.work();
        obj.show();
    }
}
