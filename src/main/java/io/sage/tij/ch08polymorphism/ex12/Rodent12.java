package io.sage.tij.ch08polymorphism.ex12;

import static tools.Print.println;

/**
 * 哺乳纲啮齿目动物
 *
 * @author: Sage
 * @version:
 * @date: 2018-12-08 11:44
 **/
class Characteristic {
    private String s;

    Characteristic(String s) {
        this.s = s;
        println("Creating Characteristic " + s);
    }
}

class Description {
    private String s;

    Description(String s) {
        this.s = s;
        println("Creating Description " + s);
    }
}

class Rodent {
    private String name = "Rodent14";

    private Characteristic c = new Characteristic("has tail");
    private Description d = new Description("small mammal");

    Rodent() {
        println("Rodent()");
    }

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
    private Characteristic c = new Characteristic("likes cheese");
    private Description d = new Description("nocturnal");

    Mouse() {
        println("Mouse()");
    }

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
    private Characteristic c = new Characteristic("larger");
    private Description d = new Description("black");

    Rat() {
        println("Rat()");
    }

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
    private Characteristic c = new Characteristic("climbs trees");
    private Description d = new Description("likes nuts");

    Squirrel() {
        println("Squirrel()");
    }

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

public class Rodent12 {
    private static RandomRodentGenerator gen = new RandomRodentGenerator();

    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[10];
        for (Rodent r : rodents) {
            r = gen.next();
            println(r);
//            r.eat();
//            r.run();
//            r.sleep();
        }
    }
}