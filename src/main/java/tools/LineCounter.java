package tools;

import net.mindview.util.TextFile;

import java.util.Iterator;

/**
 * // org.greggordon.util LineCounter.java
 * // Outputs file with lines numbered.
 * @link package org.greggordon.util;
 *
 * @author: Sage
 * @version:
 * @date: 2018-12-08 11:58
 **/
public class LineCounter {

    public static String lines(String filename) {
        TextFile file = new TextFile(filename);
        int i = 0;
        String s = "";
        for(Iterator it = file.iterator(); it.hasNext();) {
            s += (++i + " " + it.next() + '\n');
        }
        return s;
    }
    public static void printLines(String filename) {
        System.out.print(lines(filename));
    }
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("Usage: enter filename");
            return;
        }
        TextFile file = new TextFile(args[0]);
        int i = 0;
        for(Iterator it = file.iterator(); it.hasNext();) {
            System.out.print(++i + " " + it.next());
            System.out.println();
        }
    }

}
