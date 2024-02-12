package study.javastudy.thread;

public class ThreadEx {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("*");
        MyThread t2 = new MyThread("-");

        t1.start();//t1.start 를 실행하게되면 프로그램 흐름이 main과 쓰레드 t1 두개로 나뉘게 된다.
        t2.start();//세 개로 나뉘게 된다.

        System.out.println("main end"); //랜덤하게 milliSecond를 줬기 때문에 main 메서드가 끝나더라도 쓰레드들은 작업을 진행한다.
    }
}
