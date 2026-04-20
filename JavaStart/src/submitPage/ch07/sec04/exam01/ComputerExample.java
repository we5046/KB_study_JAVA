package submitPage.ch07.sec04.exam01;

public class ComputerExample extends Calculator{

    public double areaCircle(double r) {
        System.out.println("Computer 객체의 areaCircle() 실행");
        return Math.PI * r * r;
    }

    public static void main(String[] args) {
        Calculator myCalc = new Calculator();
        System.out.println("실행 결과: " + myCalc.areaCircle(5));
        ComputerExample myCom = new ComputerExample();
        System.out.println("실행 결과: " + myCom.areaCircle(5));

    }
}
