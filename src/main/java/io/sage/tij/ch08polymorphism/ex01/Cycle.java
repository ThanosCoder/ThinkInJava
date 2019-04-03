package io.sage.tij.ch08polymorphism.ex01;

import static net.mindview.util.Print.print;

public class Cycle {

    public static void main(String[] args) {
        Cycle[] cycles = {
                new Unicycle(),
                new Bicycle(),
                new Tricycle()
        };
        rideAll(cycles);
    }

    private static void rideAll(Cycle[] cycles) {
        for (int i = 0; i < cycles.length; i++) {
            cycles[i].ride();
        }
    }

    void ride() {
    }
}

class Unicycle extends Cycle {
    @Override
    void ride() {
        print("Unicycle.ride");
    }
}

class Bicycle extends Cycle {
    @Override
    void ride() {
        print("Bicycle.ride");
    }
}

class Tricycle extends Cycle {
    @Override
    void ride() {
        print("Tricycle.ride");
    }
}