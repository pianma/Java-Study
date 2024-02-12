package study.javastudy.capsule;

public class BikeRunner {

//    캡슐화는 특정 데이터에 접근해 값을 설정하는 데이터와 메서드
//    캡슐화는 데이터를 클래스 안에 안전히 가두는 방법
//    정보를 은닉하여 보안을 높일 수 있다.
//    bike 클래스의 변수는 private 로 접근 제어자 선언을 해놓았기 때문에 bike 클래스 내부에서만 접근이 가능하다.
//    접근을 위해 setter와 getter라는 장치를 만들어 내부에서 접근가능하다.

    public static void main(String[] args) {
        Bike hyundai = new Bike();
        Bike kia = new Bike();

        hyundai.setSpeed(100);
        hyundai.getSpeed();

        kia.setSpeed(200);
        kia.getSpeed();

        kia.decreaseSpeed(100);
        hyundai.inCreaseSpeed(100);

        System.out.println(kia.getSpeed());
        System.out.println(hyundai.getSpeed());
    }
}
