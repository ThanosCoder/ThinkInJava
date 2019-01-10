package io.sage.tij.ch07_Polymorphism.ex14;

import static net.mindview.util.Print.print;
import static tools.Print.println;

/**
 * Shared
 *
 * @author: Sage
 * @version:
 * @date: 2018-12-08 17:54
 **/
public class Shared {
    private static long counter = 0;
    private final long id = counter++;
    private int refcount = 0;

    public Shared() {
        print("Creating " + this);
    }

    public void addRef() {
        refcount++;
    }

    protected void dispose() {
        if (--refcount == 0) {
            print("Disposing " + this);
        }
    }

    @Override
    public String toString() {
        return "Shared " + id;
    }

    public void showRefcount() {
        println("refcount = " + refcount);
    }
}
