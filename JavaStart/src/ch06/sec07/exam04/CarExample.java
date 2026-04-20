package ch06.sec07.exam04;

public class CarExample {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("자가용");
        Car car3 = new Car("자가용", "빨강");
        Car car4 = new Car("택시", "검정", 200);

        car1.printInfo("car1");
        car2.printInfo("car2");
        car3.printInfo("car3");
        car4.printInfo("car4");
    }
}
