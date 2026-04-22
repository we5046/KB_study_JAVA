package com.multi.ch06.sec14;

public class Car {
    private int speed;
    private boolean stop;

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {

        if(this.stop || speed <= 0) {
            this.speed = 0;
        } else {
            this.speed = speed;
        }
    }

    public void setStop() {
        this.stop = true;
        this.speed = 0;
    }
}
