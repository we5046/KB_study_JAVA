package sutmit0422.exam03;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100", "1oo", null, "200"};

        for(int i = 0; i<=array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]: " + value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("반복문 index가 범위를 벗어난 입력을 시도 했습니다.");
                System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
            } catch (NumberFormatException | NullPointerException e) {
                System.out.println("숫자로 변환이 불가능합니다. 데이터가 이상합니다.");
                System.out.println("NumberFormatException | NullPointerException: " + e.getMessage());
            }
        }
    }
}
