package study.javastudy.generic;

class EmployeeInfo{
    public int rank;
    EmployeeInfo(int rank){
        this.rank = rank;
    }
}

class Person<T,S>{
    public T info;
    public S id;
    Person(T info, S id){
        this.info = info;
        this.id = id;
    }

    public<U> void printInfo(U info){
        System.out.println(info);
    }
}
public class Generic {
    public static void main(String[] args) {
        EmployeeInfo e = new EmployeeInfo(1);
        Integer i = Integer.valueOf(10);
//        Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(e, i);
        Person p1 = new Person(e, i);
        p1.printInfo(e);
    }
}