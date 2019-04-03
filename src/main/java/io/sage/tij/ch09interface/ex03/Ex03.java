package io.sage.tij.ch09interface.ex03;

/**
 * Create a base class with an abstract print() method that is overridden in a
 * derived class. The overridden version of the method prints the value of an int
 * variable defined in the derived class. At the point of definition of this
 * variable, give it a nonzero value. In the base-class constructor, call this
 * method. In main(), create an object of the drived type, and then call its
 * print() method. Explain the results.
 *
 * @author: Sage
 * @version:
 * @date: 2019-02-08 19:28
 **/

abstract class Base {

    public Base() {
        print();
    }

    abstract void print();
}

class Ext extends Base {

    private int val = 1;

    @Override
    void print() {
        System.out.println("Ext.val = " + val);
    }
}

/**
 * output:
 * Ext:0
 * Ext:1
 *
 * Base()中执行print时，val并没有进行Ext中的赋值操作。所以print的结果是0
 */
public class Ex03 {

    public static void main(String[] args) {
        /* Process of initialization:
         * 1. Storage for Ext obj allocated and initialized to binary zero
         * 2. Base() called
         * 3. Ext.print() called in Base() (obj.val = 0)
         * 4. Member initializes called in order (obj.val = 1)
         * 5. Body of Ext() called
         */
        Ext obj = new Ext();
        obj.print();
    }
}
