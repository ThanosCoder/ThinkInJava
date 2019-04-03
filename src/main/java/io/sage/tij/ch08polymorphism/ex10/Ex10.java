package io.sage.tij.ch08polymorphism.ex10;

import static tools.Print.println;

/**
 * Ex10
 *
 * @author: Sage
 * @version:
 * @date: 2018-12-08 12:22
 **/
public class Ex10 {
    public static void main(String[] args) {
//        Base obj = new Ext();
        Ext obj = new Ext();
        // automatic upgrade to base-class to call base-class method A.f()
        // which,by polymorphism, will call the derived-class method B.g():
        obj.f();
    }
}

class Base {
    protected void f() {
        println("Base.f()");
        this.g();
    }

    protected void g() {
        println("Base.g()");
    }
}

class Ext extends Base {
    @Override
    protected void g() {
        println("Ext.g()");
    }
}

