package io.sage.tij.ch09interface.ex08;

import static net.mindview.util.Print.print;

/**
 * TODO
 *
 * @author: Sage
 * @version:
 * @date: 2019-02-09 20:01
 **/
interface FastFood {
    void cheeseburger();
    void fries();
    void softDrink();
}

class Meal {
    Meal() {
        print("Meal()");
    }
}

class Bread {
    Bread() {
        print("Bread()");
    }
}

class Cheese {
    Cheese() {
        print("Cheese()");
    }
}

class Lettuce {
    Lettuce() {
        print("Lettuce()");
    }
}

class Lunch extends Meal {
    Lunch() {
        print("Lunch()");
    }
}

class PortableLunch extends Lunch {
    PortableLunch() {
        print("PortableLunch()");
    }
}

public class Sandwich {
}
