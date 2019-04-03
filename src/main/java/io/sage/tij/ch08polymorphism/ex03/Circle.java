//: polymorphism/shape/Circle.java
package io.sage.tij.ch08polymorphism.ex03;

import static net.mindview.util.Print.print;

public class Circle extends Shape {
    @Override
    public void draw() {
        print("Circle.draw()");
    }

    @Override
    public void erase() {
        print("Circle.erase()");
    }

    @Override
    public void amend() {
        print("Circle.amend()");
    }
} ///:~
