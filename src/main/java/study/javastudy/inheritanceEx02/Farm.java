package study.javastudy.inheritanceEx02;

public class Farm {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.Groom();;

        //상위 클래스에서 하위 클래스 참조
        Pet pet = new Dog();
        pet.Groom();

        System.out.println(pet instanceof  Pet);
        System.out.println(pet instanceof  Dog);
        System.out.println(pet instanceof String); //Error
        System.out.println(pet instanceof Animal);
        System.out.println(pet instanceof Object);


        Animal animal = new Animal();

        System.out.println(animal instanceof pet); //error
        System.out.println(animal instanceof dog); //error
        System.out.println(Dog instanceof Animal); //error
        System.out.println(Pet instanceof Pet);; //error
    }
}
