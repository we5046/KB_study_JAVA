package com.multi.basic;

import java.util.Scanner;

// 변수, 연산자, 제어문, 반복문, 배열
public class MyClass {
    // 단항 +, -, ++, --, ~
    public void unaryOperators() {
        int x = 1, y =2, z=3;
        int rx=++ x + y-- + ++z;
    }

    public void ternaryOperators() {
        // 삼항 연산자
        System.out.print("입력>>");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int x = 1, y =2, z=3;
        int rx = (x==k) ? y : z;

        System.out.println(rx);
    }

    public void logicalOperators(int x, int y, int z, int k) {
        boolean rs = ++x == ++y & --z < --k;
        System.out.println("x= " + x + "y= " + y + "z= " + z + "k= " + k);
    }
    public static void main(String[] args) {
        MyClass m = new MyClass();
        m.unaryOperators();

        m.ternaryOperators();
        // 초기화를 안해서를 다른말로? ->

        m.logicalOperators(1, 2, 3, 4);
    }
}
