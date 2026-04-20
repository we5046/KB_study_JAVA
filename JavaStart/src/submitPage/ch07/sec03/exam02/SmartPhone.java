package submitPage.ch07.sec03.exam02;

public class SmartPhone extends Phone {
    public SmartPhone(String model, String color) {
        super(model, color);
    }

    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("아이폰14Pro", "흰색");
        System.out.println(myPhone.getModel());
        System.out.println(myPhone.getColor());
    }
}
