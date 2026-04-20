package ch06.sec08.exam03;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setGas(6);
        System.out.println("출발합니다.");
        myCar.isLeftGas();
        myCar.run();
        System.out.println("gas를 주입하세요.");
    }
}
