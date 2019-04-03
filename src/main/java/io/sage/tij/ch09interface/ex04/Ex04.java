package io.sage.tij.ch09interface.ex04;

import static tools.Print.println;

/**
 * Create an abstract class with no methods. Derive a class and add a method.
 * Create a static method that takes a reference to the base class, downcasts
 * it to the derived class, and calls the method. In main(), demonstrate that it
 * works. Now put the abstract declaration for the method in the base class, thus
 * eliminating the need for the downcast.
 *
 * @author: Sage
 * @version:
 * @date: 2019-02-08 19:46
 **/

abstract class Base {
}

class Ext extends Base {
    protected void print() { println("Ext"); }
}

abstract class BasePro {
    abstract protected void print();
}

class ExtPro extends BasePro {
    @Override
    protected void print() { println("ExtPro"); }
}

public class Ex04 {

    public static void testPrint(Base d) {
        ((Ext)d).print();
    }

    public static void secondTestPrint(BasePro sd) {
        sd.print();
    }

    public static void main(String[] args) {
        Ext ext = new Ext();
        Ex04.testPrint(ext);
        ExtPro extPro = new ExtPro();
        Ex04.secondTestPrint(extPro);
    }
}
