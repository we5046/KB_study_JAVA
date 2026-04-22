package com.multi.ch06.sec08.exam02;

public class Computer {

    public int sum(int ...x) {
        int sum_value = 0;
        for(int k: x) {
            sum_value += k;
        }
        return sum_value;
    }
}
