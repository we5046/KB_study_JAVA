package ch06.sec09;

public class Car {
    String model;
    int speed;

    public Car(){
        this("기본 모델");
    }
    public Car(String model) {
        this.model = model;
    }

    public int getSpeed(){
        return this.speed;
    }

    public boolean setSpeed(int set_value) {
        try{
            this.speed = set_value;
        } catch(Error e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

    // run 메서드
    public void run() {
        System.out.println(model + "가 달립니다. (시속: " + speed + "km/h)");
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.run();
        myCar.setSpeed(50);
        myCar.run();
    }
}

