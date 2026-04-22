package submit0421.exam02;

public class A {
    class B {
        int field1 = 1;
        static int field2 = 2;

        void method1() {
            System.out.println("method1");
        }

        static void method2() {
            System.out.println("method2");
        }
    }

    void useB() {
        B b = new B();
        System.out.println(b.field1);
        b.method1();

        System.out.println(B.field2);
        B.method2();
    }
}
