package submit0421.exam01;

public class AExample {
    A a = new A();
    A.B b = a.new B();

    // 사유: B 클래스는 A 내부에 있기 때문에, A를 통해 접근
}
