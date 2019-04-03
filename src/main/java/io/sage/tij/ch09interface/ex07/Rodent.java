package io.sage.tij.ch09interface.ex07;

import java.util.Random;

/**
 * Modify Exercise 9 in the Polymorphism chapter so that Rodent is an
 * interface.
 *
 * @author: Sage
 * @version:
 * @date: 2019-02-08 20:29
 **/
public interface Rodent {
    String name = "Rodent";

    /**
     * eat
     */
    void eat();

    /**
     * run
     */
    void run();

    /**
     * sleep
     */
    void sleep();

    /**
     * 返回字符串
     *
     * @return
     */
    @Override
    String toString();
}
