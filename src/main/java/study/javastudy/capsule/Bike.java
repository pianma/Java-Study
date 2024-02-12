package study.javastudy.capsule;

public class Bike {

    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed > 0) this.speed = speed;
    }

    public void inCreaseSpeed(int howMuch){
        setSpeed(this.speed += howMuch);

    }

    public void decreaseSpeed(int howMuch){
        setSpeed(this.speed -= howMuch);
    }
}
