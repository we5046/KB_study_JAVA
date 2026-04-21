package submit0421.normal02;

public class A {
    class B {
        // 인스턴스 필드
        int field1 = 1;

        // 정적 필드
        static int field2 = 2;

        B() {
            System.out.println("B-생성자 실행");
        }

        void method1() {
            System.out.println("B-method1 실행");
        }

        static void method2() {
            System.out.println("B-method2 실행");
        }
    }

    void useB() {
        B b = new B();
        System.out.println(b.field1);
        B.method2();
    }
}
