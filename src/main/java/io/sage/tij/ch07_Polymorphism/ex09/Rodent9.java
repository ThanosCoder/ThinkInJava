package io.sage.tij.ch07_Polymorphism.ex09;

import static tools.Print.println;

/**
 * 哺乳纲啮齿目动物
 *
 * @author: Sage
 * @version:
 * @date: 2018-12-08 11:44
 **/
class Rodent {
    private String name = "Rodent9";

    protected void eat() {
        println("Rodent9.eat()");
    }

    protected void run() {
        println("Rodent9.run()");
    }

    protected void sleep() {
        println("Rodent9.sleep()");
    }

    @Override
    public String toString() {
        return name;
    }
}

/**
 * 啮齿动物：老鼠
 */
class Mouse extends Rodent {
    private String name = "Mouse";

    @Override
    protected void eat() {
        println("Mouse.eat()");
    }

    @Override
    protected void run() {
        println("Mouse.run()");
    }

    @Override
    protected void sleep() {
        println("Mouse.sleep()");
    }

    @Override
    public String toString() {
        return name;
    }
}

class Rat extends Rodent {
    private String name = "Rat";

    @Override
    protected void eat() {
        println("Rat.eat()");
    }

    @Override
    protected void run() {
        println("Rat.run()");
    }

    @Override
    protected void sleep() {
        println("Rat.sleep()");
    }

    @Override
    public String toString() {
        return name;
    }
}

class Squirrel extends Rodent {
    private String name = "Squirrel";

    @Override
    protected void eat() {
        println("Squirrel.eat()");
    }

    @Override
    protected void run() {
        println("Squirrel.run()");
    }

    @Override
    protected void sleep() {
        println("Squirrel.sleep()");
    }

    @Override
    public String toString() {
        return name;
    }
}

public class Rodent9 {
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