package com.multi.inner;

import javax.swing.*;

public class LocalOuterClass {
    // member inner, staticInner, LocalInner
    private int outerValue;
    public void method1() {
        int localValue;
        class localInner{
            public localInner(){
                outerValue = 100;
            }
        }
    }

    public void method2() {
        class LocalInner2 extends JButton {

        }
        LocalInner2 i2 = new LocalInner2();

    }
}
