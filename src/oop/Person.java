package oop;

//객체 --> 클래스에 의해 만들어진다.
//객체생성 (필드, 생성자, 메소드, 오버로딩, this, static, final)
//객체 (사물 그 자체)
//객체 (기능을 가지고 있는 데이터)

// 설계도 = 틀 = Class = 사용자 정의 자료형 = 100% reference type
public class Person {
    private String name;
    private int age;
    private double height;

    public Person() {
    }

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //  private static String nation;
    public static void main(String[] args) {
    // 기본 자료형에서 참조 자료형까지
        // int data;
        // int []m = new int[5];
        //
        // Person p = new Person();
        // new Person().name="민서";
        // System.out.println(new Person().name);

        // 설계도 (속성+기능)
        Person p1 = new Person(); // name | age | height
        p1.setName("박성훈");

        Person p2 = new Person();
        System.out.println(p2.getName());
    }


}
