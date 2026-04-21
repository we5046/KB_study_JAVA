package interfaces;

// 구현 클래스와 interface만 있다면 아까 처럼 원치않은 것도 구현해야한다.
// 내가 Adapter 역할을 해줄게
public abstract class AbstractWindowClass implements MouseListenerEx{
    @Override
    public void mouseClicked() {
    }

    @Override
    public void mousePress() {

    }

    @Override
    public void mouseExit() {

    }
}
