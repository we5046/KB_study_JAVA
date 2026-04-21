package submit0421.normal05;

public class Button {
    public static interface ClickListener {
        void onClick();
    }

    private ClickListener clickListener;

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void onClick() {
        this.clickListener.onClick();
    }
}
