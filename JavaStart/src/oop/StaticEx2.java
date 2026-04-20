package oop;

public class StaticEx2 {
    private static StaticEx2 instance;
    private int data;
    public StaticEx2(){
        this.data= 10;
    }

    public static StaticEx2 getInstance() {
        if(instance == null) {
            instance = new StaticEx2();
        }
        return instance;
    }
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }


}
