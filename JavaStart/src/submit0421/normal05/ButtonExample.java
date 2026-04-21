package submit0421.normal05;

public class ButtonExample {
    public static void main(String[] args) {
        Button OKBtn = new Button();

        class OKListener implements Button.ClickListener{

            @Override
            public void onClick() {
                System.out.println("OK 버튼을 클릭했습니다.");
            }
        }

        OKBtn.setClickListener(new OKListener());
        OKBtn.onClick();
    }
}
