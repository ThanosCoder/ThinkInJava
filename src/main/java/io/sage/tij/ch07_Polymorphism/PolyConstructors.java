package io.sage.tij.ch07_Polymorphism;//: polymorphism/PolyConstructors.java
// Constructors and polymorphism
// don't produce what you might expect.

import static net.mindview.util.Print.print;

class Glyph {
    private int i = 0;

    Glyph() {
        print("Glyph() before draw()");
        draw();
        print("Glyph() after draw()");
    }

    Glyph(int i) {
        this.i = i;
        print("Glyph(i) before draw()");
        draw();
        print("Glyph(i) after draw()");
    }

    void draw() {
        print("Glyph.draw()");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;

    RoundGlyph(int r) {
        radius = r;
        print("RoundGlyph.RoundGlyph(), radius = " + radius);
    }

    @Override
    void draw() {
        print("RoundGlyph.draw(), radius = " + radius);
    }
}

public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
    }
} /* Output:
Glyph() before draw()
RoundGlyph.draw(), radius = 0
Glyph() after draw()
RoundGlyph.RoundGlyph(), radius = 5
*///:~
