package ch06.sec08.exam01;

public class Calculator {

    public int plus(int x, int y) {
        return x + y;
    }

    public double divide(double x, double y) {
        if(y == 0) {
            System.out.println("error");
            return -1;
        }
        return x/y;
    }


    public void powerOn() {
        System.out.println("전원을 켭니다.");
    }

    public void powerOff() {
        System.out.println("전원을 끕니다.");
    }
}
