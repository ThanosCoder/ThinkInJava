package io.sage.tij.ch09interface.ex05;

import io.sage.tij.ch09interface.ex05.extpackage.IntefaceEx5;

/**
 * TODO
 *
 * @author: Sage
 * @version:
 * @date: 2019-02-08 20:01
 **/
public class Ex05 implements IntefaceEx5 {
    @Override
    public void sayOne() {
        System.out.println("one");
    }

    @Override
    public void sayTwo() {
        System.out.println("two");
    }

    @Override
    public void sayThree() {
        System.out.println("three");
    }

    public static void main(String[] args) {
        Ex05 obj = new Ex05();
        obj.sayOne();
        obj.sayTwo();
        obj.sayThree();
    }
}
