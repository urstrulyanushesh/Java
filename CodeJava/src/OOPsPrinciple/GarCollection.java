package OOPsPrinciple;

class Garbage{
    Garbage(){
        System.out.println("Obj has been created");
    }
    protected void finalize(){
        System.out.println("Destroyed");
    }
}
public class GarCollection {
    public static void main(String[] args) {
        Garbage g0=new Garbage();
        g0=null;
        Garbage g1=new Garbage();
        Garbage g2=new Garbage();
        g1=g2;
        new Garbage();
        System.gc();
    }
}
