package interfaces.SOLID.designPattern;

public class StringDisplayMain {
    public static void main(String[] args) {
        AbstractDisplay myDisplay = new CharDisplay('c');
        myDisplay.open();

        myDisplay.close();

    }

}
