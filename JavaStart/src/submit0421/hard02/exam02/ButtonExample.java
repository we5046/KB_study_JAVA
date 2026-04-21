package submit0421.hard02.exam02;

public class ButtonExample {
    public static void main(String[] args) {
        Button btnOk = new Button();

        btnOk.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("OK 버튼을 클릭했습니다.");
            }
        });

        btnOk.click();
        Button btnCancel = new Button();

        //Cancel 버튼 객체에 ClickListener 구현 객체 주입
        btnCancel.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("Cancel 버튼을 클릭했습니다.");
            }
        });

        //Cancel 버튼 클릭하기
        btnCancel.click();
    }
}
