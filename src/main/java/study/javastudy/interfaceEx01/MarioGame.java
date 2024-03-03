package study.javastudy.interfaceEx01;

public class MarioGame implements GamingConsole{

    @Override
    public void up() {
        System.out.println("jump");
    }

    @Override
    public void down() {
        System.out.println("goes into a hole");
    }

    @Override
    public void left() {
        System.out.println();
    }

    @Override
    public void right() {
        System.out.println("go Forward");
    }
}
