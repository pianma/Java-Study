package study.javastudy;
// 클래스로 상수를 정리하게 되면 각각의 멤버를 배열처럼 열거할 수 없다.
// enum을 쓰면 어떠한 데이터가 있는지 몰라도 마치 배열처럼 그 안에 있는 데이터를 하나씩 꺼내서 쓸 수 있다. -> values 사용
// 열거형은 연관된 값들을 저장한다. 또 그 값들이 변경되지 않도록 보장한다.
// 열거형 자체가 클래스이기 때문에 열거형 내부에 생성자, 필드, 메소드를 가질 수 있어서 많은 역할을 할 수 있다.
//class Fruit{
//    public static final Fruit APPLE = new Fruit();
//    public static final Fruit PEACH = new Fruit();
//    public static final Fruit BANANA = new Fruit();
//}

enum Fruit{
    APPLE("red"), PEACH("pink"), BANANA("yellow");
    private String color;

    public String getColor(){
        return this.color;
    }
    Fruit(String color){
        System.out.println("Call constructor" + this);
        this.color = color;
    }
}

enum Company{
    GOOGLE, APPLE, ORACLE
}

public class Enum {
    public static void main(String[] args) {

        for(Fruit x : Fruit.values()){
            System.out.println(x);
        }


        Fruit type = Fruit.APPLE;
        switch (type){
            case APPLE:
                System.out.println(57 + "kcal" + Fruit.APPLE.getColor());
                break;
            case PEACH:
                System.out.println(34 + "kcal" + Fruit.PEACH.getColor());
                break;
            case BANANA:
                System.out.println(93 + "kcal" + Fruit.BANANA.getColor());
                break;
        }

    }
}
