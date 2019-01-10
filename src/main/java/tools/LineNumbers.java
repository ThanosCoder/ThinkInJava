package tools;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * // org.greggordon.util LineNumbers.java
 * // Outputs command line file.ext to new fileNUM.ext with lines numbered.
 * @link package org.greggordon.util;
 *
 * @author: Sage
 * @version:
 * @date: 2018-12-08 12:01
 **/
public class LineNumbers {
    public static void main(String[] args) throws IOException {
        if(args.length != 1) {
            System.out.println("Usage: enter filename");
            System.exit(0);
        }
        String file = args[0];
        BufferedReader in = new BufferedReader(
                new FileReader(file));
        String[] temp = args[0].split("\\.");
        String fileOut = temp[0] + "NUM." + temp[1];
        PrintWriter out = new PrintWriter(fileOut);
        int lineCount = 1;
        String s;
        while((s = in.readLine()) != null ) {
            out.println(lineCount++ + " " + s);
        }
        in.close();
        out.close();
        System.out.println("See file " + fileOut);
    }
}
