package ch06.sec06.exam01;

public class Car {
    // 필드 선언
    String model;
    boolean start;
    int speed;

    public void print(){
        System.out.println(model + " "+ start +" " + speed);
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        // stack-> 쓰레기 값 | heap -> 0 ( null, false, 0)
        myCar.print();

        // Method, Class에 있는 속성들이 Method 영역에 갈거같다?
    }
}
