package LabReport;

class Grand{
    void display(){
        System.out.println("A is GrandParent");
    }
}

class Parent extends Grand{
    void show(){
        System.out.println("B is Parent");
    }
}

class Child extends Parent{
    void showDisplay(){
        System.out.println("C is Child");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
        obj.show();
        obj.showDisplay();
    }
}
