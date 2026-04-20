package ch06.sec07.exam04;

public class Car {
    // 필드 선언
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    public Car(){}

    public Car(String model) {
        this.model = model;
    }

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public void printInfo(String carName) {
        System.out.println(carName + ".company : " + company);

        if (model != null)
            System.out.println(carName + ".model : " + model);

        if (color != null)
            System.out.println(carName + ".color : " + color);

        if (maxSpeed != 0)
            System.out.println(carName + ".maxSpeed : " + maxSpeed);

        System.out.println();
    }
}
