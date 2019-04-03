package io.sage.tij.ch09interface.ex06;

/**
 * Prove that all the methods in an interface are automatically public
 *
 * @author: Sage
 * @version:
 * @date: 2019-02-08 20:19
 **/
public class TestEx06 {
    public static void main(String[] args) {
        Ex06 x = new Ex06();
        x.sayOne();
        x.sayTwo();
        x.sayThree();
    }
}
