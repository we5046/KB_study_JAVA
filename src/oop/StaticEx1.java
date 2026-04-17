package oop;

// static(정적) -> 변수, 메소드, 클래스
// static == 공통
public class StaticEx1 {
    private int instanceValue;
     static int staticValue;

    public void increment() {
        int localValue = 0;
        localValue++;
        this.instanceValue++;
        StaticEx1.staticValue++;

    }
    public static void main(String[] args) {
        staticValue = 10;   // 같은영역의 static 메소드라 접근이 가능함.
    }
}
