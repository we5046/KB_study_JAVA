package ch04.sec04;

public class SumFrom1To100Example {
    public static void main(String[] args) {
        int count =0;

        // 문제 4
        // for문
        for(int i=1; i<=100; i++){
            count+= i;
        }


        // 문제 6
        // while문
//        int counter=0;
//        while(++counter < 101) {
//            count += counter;
//        }
        System.out.printf("1~100 합 : %d", count);
    }
}
