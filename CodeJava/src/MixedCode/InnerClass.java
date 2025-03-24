package MixedCode;

public class InnerClass {
    class Animal {
        String type;
    }

    static class Vehicle {
        String color;
    }

    public static void main(String[] args) {
        InnerClass obj = new InnerClass(); // Create an instance of the outer class

        // Creating an instance of the non-static inner class Animal
        Animal dog = obj.new Animal();
        dog.type = "Shepherd";
        System.out.println(dog.type);

        // Creating an instance of the static inner class Vehicle
        Vehicle car = new InnerClass.Vehicle(); // Correct way to instantiate a static inner class
        car.color = "Black";
        System.out.println(car.color);
    }
}
