package io.sage.tij.ch07_Polymorphism.ex12;

import java.util.Random;

/**
 * TODO
 *
 * @author: Sage
 * @version:
 * @date: 2018-12-08 12:07
 **/
public class RandomRodentGenerator {

    public final Random rand = new Random(47);

    public Rodent next() {
        switch (rand.nextInt(3)) {
            default:
            case 0:
                return new Mouse();
            case 1:
                return new Rat();
            case 2:
                return new Squirrel();
        }
    }
}
