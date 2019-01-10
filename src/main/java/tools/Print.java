package tools;

import java.io.PrintStream;

/**
 * // print and println shorthand
 * // using Java SE5 static imports
 * // modified from TIJ 4 (thank you Bruce Eckel)
 * @link package org.greggordon.tools;
 *
 * @author: Sage
 * @version:
 * @date: 2018-12-08 11:55
 **/
public class Print {
    // Print with a newline:
    public static void println(Object obj) {
        System.out.println(obj);
    }
    // Print newline:
    public static void println() {
        System.out.println();
    }
    // Print with no line break:
    public static void print(Object obj) {
        System.out.print(obj);
    }
    // The new Java SE5 printf() (from C):
    public static PrintStream printf(String format, Object... args) {
        return System.out.printf(format, args);
    }
}
