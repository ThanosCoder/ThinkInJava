package io.sage.thinkinjava.ch07.polymorphism.ex03;//: polymorphism/Main.java
// Polymorphism in Java.

public class Main {

    public static void main(String[] args) {
        Shape[] s = new Shape[]{new Circle(), new Square(), new Triangle()};
        // Make polymorphic method calls:
        for (Shape shp : s) {
            shp.amend();
        }
    }
} /* Output:
子类未覆盖:
Shape.amend()
Shape.amend()
Shape.amend()
Circle类覆盖:
Circle.amend()
Shape.amend()
Shape.amend()
子类全覆盖：
Circle.amend()
Square.amend()
Triangle.amend()
*///:~
