package interfaces;

public class AWindowClass {
    // 마구잡이로 구현하면 표준화가 안된다.
    // 다형성

    public AWindowClass() {
        new AbstractWindowClass(){

            @Override
            public void mouseClicked() {
                super.mouseClicked();
            }
        };
    }

}
