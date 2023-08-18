package study.javastudy;

public class ThreadEx3 {

    public static void main(String[] args) {
        ThreadEx2 t1 = new ThreadEx2("*");
        ThreadEx2 t2 = new ThreadEx2("-");

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);

        thread1.start();
        thread2.start();
    }
}
