package study.javastudy.interfaceEx03;

class Dog extends Animal{

    @Override
    void bark() {
        System.out.println("Bow Bow");
    }
}

class Cat extends Animal{

    @Override
    void bark() {
        System.out.println("Meow Meow");
    }
}

abstract class Animal{
   abstract void bark();

}

public class AnimalRunner {
    public static void main(String[] args) {
        Animal[] animals = {new Cat(), new Dog()};
        for(Animal x : animals){
            x.bark();
        }
    }
}
