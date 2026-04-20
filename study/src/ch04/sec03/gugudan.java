package ch04.sec03;

public class gugudan {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            System.out.printf("*** %d단 ***\n", i);
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
