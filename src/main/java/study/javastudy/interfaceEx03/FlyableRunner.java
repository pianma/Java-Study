package study.javastudy.interfaceEx03;

interface Flyable{
    void Fly();
}

class Bird implements Flyable{

    @Override
    public void Fly() {
        System.out.println("with wings");
    }
}

class Airplane implements Flyable{

    @Override
    public void Fly() {
        System.out.println("with fuel");
    }
}

public class FlyableRunner {
    public static void main(String[] args) {
       Flyable[]  flyingObjects = {new Bird(), new Airplane()};
       for(Flyable x : flyingObjects){
           x.Fly();
       }
    }
}
