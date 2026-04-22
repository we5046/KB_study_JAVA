package com.multi.exception;

// RunTime, Compile
public class ExceptionEx1 implements Cloneable{
    public void ArrayIndexOutOfBoundsException() {
        int[] m = new int[5];
        for (int i = 0; i <= m.length; i++) {
            try{
                m[i] = 10/(int)Math.random() * 100;
            } catch ( ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException");
            } catch ( ArithmeticException e) {
                System.out.println("ArithmeticException");
            } catch (Exception e) {
                System.out.println(e.toString());
            } finally {
                System.out.println("이건 하고 가라");
            }
        }
    }

    public void CloneNotSupportedException() {
        try {
            ExceptionEx1 e1 = new ExceptionEx1();
            ExceptionEx1 e2 = (ExceptionEx1)e1.clone();
            System.out.println(e2);
        } catch(Throwable e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        ExceptionEx1 e = new ExceptionEx1();
        e.CloneNotSupportedException();

    }
}
