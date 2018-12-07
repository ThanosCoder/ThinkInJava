//: polymorphism/shape/Triangle.java
package io.sage.thinkinjava.ch07.polymorphism.ex03;

import static net.mindview.util.Print.print;

public class Triangle extends Shape {
    @Override
    public void draw() {
        print("Triangle.draw()");
    }

    @Override
    public void erase() {
        print("Triangle.erase()");
    }

    @Override
    public void amend() {
        print("Triangle.amend()");
    }
} ///:~
