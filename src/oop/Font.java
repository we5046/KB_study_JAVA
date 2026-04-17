package oop;

public class Font {
    private String face;
    private int size;
    private String color;

    public Font() {
        this("");
    }

    public Font(String face) {
        this(face, 0);
    }

    public Font(String face, int size) {
        this(face, size, "");
    }

    public Font(String face, int size, String color) {
        this.face = face;
        this.size = size;
        this.color = color;
    }

    public static void main(String[] args) {
        Font f1 = new Font("궁서",15, "red");
        int data= 10;
        System.out.println(f1);

    }

    // 모든 개체들의 속성을 하나로 출력해주는 게 toString

    @Override
    public String toString() {
        return "Font{" +
                "face='" + face + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
