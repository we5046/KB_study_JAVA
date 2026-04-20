package oop;

public class StaticEx2Main {
    // StaticEx2 s = new StaticEx2();
    public static void main(String[] args) {
        StaticEx2.getInstance().setData(100);
        System.out.println(StaticEx2.getInstance().getData());
    }
}
