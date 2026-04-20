package ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int speed = 0;

        while(run) {
            System.out.println("-------------------------");
            System.out.println("1. 증속 | 2. 감속 | 3. 중지");
            System.out.println("-------------------------");
            System.out.println("선택: ");

            int strNum = scanner.nextInt();   // 숫자만 읽고 \n은 남김

            System.out.print("이름 입력: ");
            String name = scanner.nextLine();  // 남아있던 \n을 바로 읽어버림

            System.out.println("숫자: " + strNum);
            System.out.println("이름: [" + name + "]");
            if(strNum == 1) {
                speed++;
                System.out.println("현재 속도 = " + speed);
            } else if(strNum == 2) {
                speed--;
                System.out.println("현재 속도 = " + speed);
            } else if(strNum == 3) {
                run = false; // while문의 조건식을 false로
            }
        }

        System.out.println("프로그램 종료");
    }
}
