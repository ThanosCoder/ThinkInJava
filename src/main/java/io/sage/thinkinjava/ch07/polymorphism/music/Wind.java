//: polymorphism/music/Wind.java
package io.sage.thinkinjava.ch07.polymorphism.music;

// Wind objects are instruments
// because they have the same interface:
public class Wind extends Instrument {
    // Redefine interface method:
    @Override
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }
} ///:~
