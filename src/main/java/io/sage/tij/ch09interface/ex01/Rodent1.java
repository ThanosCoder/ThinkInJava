package io.sage.tij.ch09interface.ex01;

import static tools.Print.println;

/**
 * Chapter9 Ex1
 *
 * @author: Sage
 * @version:
 * @date: 2019-02-08 17:34
 **/
abstract class Rodent {

    private String name = "Rodent";

    abstract void eat();

    abstract void run();

    abstract void sleep();
}

class Mouse extends Rodent {
    private String name = "Mouse";
    @Override
    protected void eat() { println("Mouse.eat()"); }
    @Override
    protected void run() { println("Mouse.run()"); }
    @Override
    protected void sleep() { println("Mouse.sleep()"); }
    @Override
    public String toString() { return name; }
}

class Rat extends Rodent {
    private String name = "Rat";
    @Override
    protected void eat() { println("Rat.eat()"); }
    @Override
    protected void run() { println("Rat.run()"); }
    @Override
    protected void sleep() { println("Rat.sleep()"); }
    @Override
    public String toString() { return name; }
}

class Squirrel extends Rodent {
    private String name = "Squirrel";
    @Override
    protected void eat() { println("Squirrel.eat()"); }
    @Override
    protected void run() { println("Squirrel.run()"); }
    @Override
    protected void sleep() { println("Squirrel.sleep()"); }
    @Override
    public String toString() { return name; }
}

public class Rodent1 {
    private static RandomRodentGenerator gen = new RandomRodentGenerator();

    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[10];
        for (Rodent r : rodents) {
            r = gen.next();
            println(r + ": ");
            r.eat();
            r.run();
            r.sleep();
        }
    }
}