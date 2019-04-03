package io.sage.tij.ch09interface.ex01;

import java.util.Random;

/**
 * Modify Exercise 9 in the previous chapter so that Rodent is an abstract class.
 * Make the methods of Rodent abstract whenever possible.
 *
 * @author: Sage
 * @version:
 * @date: 2019-02-08 19:08
 **/
public class RandomRodentGenerator {

        public final Random rand = new Random(47);

        public Rodent next() {
            switch (rand.nextInt(3)) {
                case 0:
                    return new Mouse();
                case 1:
                    return new Rat();
                case 2:
                    return new Squirrel();
                default:
                    throw new IllegalArgumentException();
            }
        }
}
