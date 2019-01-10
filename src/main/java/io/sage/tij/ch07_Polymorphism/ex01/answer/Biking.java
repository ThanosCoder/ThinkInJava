// polymorphism/biking/Biking.java
// TIJ4 Chapter Polymorphism, Exercise 1, page 281
/* Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
 * Demonstrate that an instance of each type can be upcast to Cycle via a ride()
 * method.
 */
package io.sage.tij.ch07_Polymorphism.ex01.answer;

import static net.mindview.util.Print.print;

class Cycle {
    private String name = "Cycle";

    public static void travel(Cycle c) {
        print("Cycle.ride() " + c);
    }

    @Override
    public String toString() {
        return this.name;
    }
}

class Unicycle extends Cycle {
    private String name = "Unicycle";

    @Override
    public String toString() {
        return this.name;
    }
}

class Bicycle extends Cycle {
    private String name = "Bicycle";

    @Override
    public String toString() {
        return this.name;
    }

}

class Tricycle extends Cycle {
    private String name = "Tricycle";

    @Override
    public String toString() {
        return this.name;
    }
}

public class Biking {
    public static void ride(Cycle c) {
        c.travel(c);
    }

    public static void main(String[] args) {
        Unicycle u = new Unicycle();
        Bicycle b = new Bicycle();
        Tricycle t = new Tricycle();
        ride(u);
        ride(b);
        ride(t);
    }
}

