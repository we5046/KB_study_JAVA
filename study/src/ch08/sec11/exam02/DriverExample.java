package ch08.sec11.exam02;

import java.util.Scanner;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        Vehicle cars[] = {
                new Taxi(),
                new Bus(),
                new Truck(),
        };


        // 사용자에게 메뉴 제시
        // 운전할 차를 선택하세요. 1) Taxi, 2) Bus
        // 운전자의 선택에 따라 실제 운전
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("운전할 차를 선택하세요: 1) Taxi, 2) Bus, 3) Truck ,,,");

            int input = sc.nextInt();

            if(input == 0) {
                break;
            }

            if(input >0 && input <=3)
                driver.drive(cars[input-1]);

        }
        sc.close();
    }
}
