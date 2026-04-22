package com.multi.inner;

public class Outer extends SuperOuter{
    private int outer;
    public Outer() {
    }

    public class Inner {
        private int inner;
        private int outer;
        public Inner(){
            outer = 20; // 내부 outer 접근
            System.out.println(outer);
            Outer.this.outer = 100; // 외부 outer 접근
            System.out.println(Outer.this.outer);
            protectedValue=100; // extends로 가져온 외부 필드
            // privateValue = 300; // private은 안됨
        }
    }

    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
    }
}
