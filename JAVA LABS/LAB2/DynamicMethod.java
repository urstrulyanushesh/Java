package LabReport;

abstract class Car{
    abstract void start();
    abstract void stop();
}

class Tesla extends Car{
    void start(){
        System.out.println("This Tesla Model is staring");
    }

    void stop(){
        System.out.println("This Tesla Model is stopped");
    }
}

class Honda extends Car{
    void start(){
        System.out.println("This Honda Model is staring");
    }

    void stop(){
        System.out.println("This Honda Model is stopped");
    }
}

public class DynamicMethod {
    public static void main(String[] args) {
        Car car = new Tesla();
        car.start();
        car.stop();
        car = new Honda();
        car.start();
        car.stop();
    }
}
