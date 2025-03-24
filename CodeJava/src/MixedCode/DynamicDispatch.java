package MixedCode;

abstract class Animal{
    abstract void  makeSound();
}
class Dog extends Animal{
    public void makeSound(){
        System.out.println("Bark Bark Bark");
    }
}

class Cat extends Animal{
    public void makeSound(){
        System.out.println("Meow Meow");
    }
}

public class DynamicDispatch {
    public static void main(String[] args) {
        Animal myDog=new Dog();
        Animal myCat=new Cat();
        animalSound(myDog);
        animalSound(myCat);
    }
        static void animalSound(Animal subClass){
        subClass.makeSound();
        }
}