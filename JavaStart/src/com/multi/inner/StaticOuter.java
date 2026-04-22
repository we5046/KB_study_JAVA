package com.multi.inner;

public class StaticOuter {
    private int outerStatic;
    public void outerMethod() {
//        private int staticValue;
//        static int sValue;

    }
    public static class StaticInner{
        private static int innerValue;
        public StaticInner() {
            // outerStatic = 100;
        }
    }

    public static void main(String[] args) {
        new StaticOuter.StaticInner();
    }
}
