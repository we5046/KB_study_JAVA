package com.multi.ch06.sec08.exam03;

public class Car {

    int gas;

    // 리턴값이 없는 메소드로 매개값을 받아서 gas 필드값을 변경
    void setGas(int gas) {
        this.gas = gas;
    }

    // 리턴값이 boolean인 메소드
    // gas가 0이면 false, 0이 아니면 true 반환
    // 조건에 따라 메시지 출력
    boolean isLeftGas() {
        if (gas == 0) {
            System.out.println("gas가 없습니다.");
            return false;
        } else {
            System.out.println("gas가 있습니다.");
            return true;
        }
    }

    // 무한 루프를 돌면서 gas를 1씩 감소
    void run() {
        while (true) {
            if (gas > 0) {
                gas--;
                System.out.println("달립니다. (gas 잔량: " + gas + ")");
            } else {
                System.out.println("멈춥니다. (gas 잔량: " + gas + ")");
                return;
            }
        }
    }
}