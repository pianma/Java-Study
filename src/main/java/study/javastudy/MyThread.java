package study.javastudy;
/*
    쓰레드란?
    프로그램마다 메모리를 할당받아서 실행된다.
    자바 프로그램은 JVM에 의해서 실행된다. JVM도 프로그램중에 하나이다.
    하나의 프로그램 안에서도 여러개의 흐름이 동작할 수 있다. 이 것을 쓰레드라고 한다.
    자바를 만든 사람들은 자바 프로그램안에서 여러개의 흐름이 흘러가도록 하고 싶었다.
    쓰레드를 사용하면 한 프로세스 내에서 두가지 또는 그 이상의 일을 동시에 할 수있다.
 */
public class MyThread extends Thread{
    String str;
    public MyThread(String str){
        this.str = str;
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++){
            System.out.println(str);

            try {
                Thread.sleep((int)(Math.random()*1000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
