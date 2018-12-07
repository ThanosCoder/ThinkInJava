package io.sage.thinkinjava.ch07.polymorphism.ex05;

import static net.mindview.util.Print.print;

public class Cycle {

    private String name = "Cycle";
    private int wheels = 0;
    public int wheels() { return wheels; }
    @Override
    public String toString() {
        return this.name;
    }

    public static void main(String[] args) {
        Cycle[] cycles = {
                new Unicycle(),
                new Bicycle(),
                new Tricycle()
        };
        for (Cycle cycle:cycles) {
            print(cycle.name);
        }
        rideAll(cycles);
    }

    // 注：此处this将动态输出子类名，如果改为this.name将输出Cycle（基类的名字）
    void ride() {print(this + " has " + wheels() +" wheel(s)");}

    private static void rideAll(Cycle[] cycles) {
        for (int i = 0; i < cycles.length; i++) {
            cycles[i].ride();
        }
    }
}

class Unicycle extends Cycle {
    private String name = "Unicycle";
    private int wheels = 1;

    @Override
    public int wheels() {
        return wheels;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

class Bicycle extends Cycle {
    private String name = "Bicycle";
    private int wheels = 2;

    @Override
    public int wheels() {
        return wheels;
    }

    @Override
    public String toString() {
        return this.name;
    }

}

class Tricycle extends Cycle {
    private String name = "Tricycle";
    private int wheels = 3;

    @Override
    public int wheels() {
        return wheels;
    }

    @Override
    public String toString() {
        return this.name;
    }
}