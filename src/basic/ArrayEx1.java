package basic;

public class ArrayEx1 {
    public static void main(String[] args) {
    int []a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] =(int)(Math.random() * 100);
        }
        for(int K : a) {
            System.out.println(K);
        }
    }
}
