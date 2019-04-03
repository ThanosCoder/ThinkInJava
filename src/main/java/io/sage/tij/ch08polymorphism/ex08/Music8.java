//: polymorphism/music3/Music7.java
// An extensible program.
package io.sage.tij.ch08polymorphism.ex08;

import io.sage.tij.ch08polymorphism.music.Note;

import static net.mindview.util.Print.print;

class Instrument {
    void play(Note n) {
        print("Instrument.play() " + n);
    }

    String what() {
        return "Instrument";
    }

    void adjust() {
        print("Adjusting Instrument");
    }

    @Override
    public String toString() {
        return what();
    }
}

class Wind extends Instrument {
    @Override
    void play(Note n) {
        print("Wind.play() " + n);
    }

    @Override
    String what() {
        return "Wind";
    }

    @Override
    void adjust() {
        print("Adjusting Wind");
    }
}

class Percussion extends Instrument {
    @Override
    void play(Note n) {
        print("Percussion.play() " + n);
    }

    @Override
    String what() {
        return "Percussion";
    }

    @Override
    void adjust() {
        print("Adjusting Percussion");
    }
}

class Stringed extends Instrument {
    @Override
    void play(Note n) {
        print("Stringed.play() " + n);
    }

    @Override
    String what() {
        return "Stringed";
    }

    @Override
    void adjust() {
        print("Adjusting Stringed");
    }
}

class Brass extends Wind {
    @Override
    void play(Note n) {
        print("Brass.play() " + n);
    }

    @Override
    void adjust() {
        print("Adjusting Brass");
    }
}

class Woodwind extends Wind {
    @Override
    void play(Note n) {
        print("Woodwind.play() " + n);
    }

    @Override
    String what() {
        return "Woodwind";
    }
}

class Keyboard extends Instrument {
    @Override
    void play(Note n) {
        print("Keyboard.play() " + n);
    }

    @Override
    public String what() {
        return "Keyboard";
    }

    @Override
    void adjust() {
        print("Adjusting Keyboard");
    }
}

class Piano extends Keyboard {
    @Override
    void play(Note n) {
        print("Piano.play() " + n);
    }

    @Override
    public String what() {
        return "Piano";
    }
}

public class Music8 {
    private static RandomInstrumentGenerator generator = new RandomInstrumentGenerator();

    // Doesn't care about type, so new types
    // added to the system still work right:
    public static void tune(Instrument i) {
        // ...
        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] e) {
        for (Instrument i : e) {
            tune(i);
        }
    }

    public static void printAll(Instrument[] e) {
        for (Instrument i : e) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        // Upcasting during addition to the array:
        Instrument[] orchestra = new Instrument[20];
        for (int i = 0; i < orchestra.length; i++) {
            orchestra[i] = generator.next();
        }
        tuneAll(orchestra);
        printAll(orchestra);
    }
} /* Output:
Wind.play() MIDDLE_C
Percussion.play() MIDDLE_C
Stringed.play() MIDDLE_C
Brass.play() MIDDLE_C
Woodwind.play() MIDDLE_C
*///:~
