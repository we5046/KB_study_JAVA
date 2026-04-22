package sutmit0422.exam02;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100", "1oo"};

        for(int i =0; i<=array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]: " + value);
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException : " + e);
            } catch(NumberFormatException e) {
                System.out.println("NumberFormatException Error : " + e);
                System.out.println("숫자로 변환 불가: " + array[i]);
            }
        }
    }
}
