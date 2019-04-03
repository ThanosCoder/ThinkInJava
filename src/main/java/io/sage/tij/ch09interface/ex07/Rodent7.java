package io.sage.tij.ch09interface.ex07;

import static tools.Print.println;

/**
 * Modify Exercise 9 in the Polymorphism chapter so that Rodent is an
 * interface.
 *
 * @author: Sage
 * @version:
 * @date: 2019-02-08 20:31
 **/

class Mouse implements Rodent {
    private String name = "Mouse";
    @Override
    public void eat() { println("Mouse.eat()"); }
    @Override
    public void run() { println("Mouse.run()"); }
    @Override
    public void sleep() { println("Mouse.sleep()"); }
    @Override
    public String toString() { return name; }
}

class Rat implements Rodent {
    private String name = "Rat";
    @Override
    public void eat() { println("Rat.eat()"); }
    @Override
    public void run() { println("Rat.run()"); }
    @Override
    public void sleep() { println("Rat.sleep()"); }
    @Override
    public String toString() { return name; }
}

class Squirrel implements Rodent {
    private String name = "Squirrel";
    @Override
    public void eat() { println("Squirrel.eat()"); }
    @Override
    public void run() { println("Squirrel.run()"); }
    @Override
    public void sleep() { println("Squirrel.sleep()"); }
    @Override
    public String toString() { return name; }
}

public class Rodent7 {
    private static RandomRodentGenerator1 gen = new RandomRodentGenerator1();
    public static void main(String[] args) {
        // Error: cannot instantiate (abstract) interface:
        // Rodent x = new Rodent();
        // But OK to create array of implementing objects:
        Rodent[] rodents = new Rodent[10];
        for(Rodent r : rodents) {
            r = gen.next();
            println(r + ": ");
            r.eat();
            r.run();
            r.sleep();
        }
    }
}
