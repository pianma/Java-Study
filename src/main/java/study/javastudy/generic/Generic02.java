package study.javastudy.generic;

abstract class Info{
    public abstract int getLevel();
}

class EmployeeInfo2 extends Info{
    public int rank;
    EmployeeInfo2(int rank){
        this.rank = rank;
    }
    public int getLevel(){
        return this.rank;
    }
}

class Person2<T extends Info>{
    public T info;
    Person2(T info){
        this.info = info;
    }
}

public class Generic02 {
    public static void main(String[] args) {
        Person2<EmployeeInfo2> p1 = new Person2<EmployeeInfo2>(new EmployeeInfo2(2));
//        Person2<String> p2 = new Person2<String>("부장");//String은 info의 자식이 아니라서 컴파일에러
    }
}
