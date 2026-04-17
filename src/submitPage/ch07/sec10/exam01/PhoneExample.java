package submitPage.ch07.sec10.exam01;

import submitPage.ch07.sec03.exam02.SmartPhone;

public class PhoneExample {
    public static void main(String[] args) {
        Phone phone = new Phone();

        SmartPhone smartPhone = new SmartPhone("홍길동");

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
