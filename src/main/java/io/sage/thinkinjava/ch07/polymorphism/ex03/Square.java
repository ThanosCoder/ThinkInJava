//: polymorphism/shape/Square.java
package io.sage.thinkinjava.ch07.polymorphism.ex03;

import static net.mindview.util.Print.print;

public class Square extends Shape {
    @Override
    public void draw() {
        print("Square.draw()");
    }

    @Override
    public void erase() {
        print("Square.erase()");
    }

    @Override
    public void amend() {
        print("Square.amend()");
    }
} ///:~
