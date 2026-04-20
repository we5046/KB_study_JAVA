package ch07.sec10.exam02;

public class AbstractMethodExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        // 매개변수의 다형성
        animalSound(new Dog());
        animalSound(new Cat());
    }

    // 전략 패턴 - 알고리즘을 패턴화
    // 메서드는 한가지 일만 하도록 작성해야한다. 단일 책임의 원칙
    public static void animalSound(Animal animal) {
        animal.sound(); // 재정의된 메소드 호출
    }
}
