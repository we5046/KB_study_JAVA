package submit0421.hard01.exam02;

public class ButtonExample {
    public static void main(String[] args) {
        Button btnOK = new Button();

        btnOK.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("OK 버튼을 클릭했습니다.");
            }
        });

        btnOK.click();
    }
}
