//: polymorphism/shape/Circle.java
package io.sage.tij.ch08polymorphism.shape;

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
} ///:~
