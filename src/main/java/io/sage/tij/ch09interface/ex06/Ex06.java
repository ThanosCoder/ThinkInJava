package io.sage.tij.ch09interface.ex06;

/**
 * TODO
 *
 * @author: Sage
 * @version:
 * @date: 2019-02-08 20:24
 **/
interface SayInteface {
    void sayOne();
    void sayTwo();
    void sayThree();
}

public class Ex06 implements SayInteface{

     // Error: cannot assign weaker access to public methods:
//      void sayOne() { System.out.println("one"); }
//      protected void sayTwo() { System.out.println("two"); }
//      private void sayThree() { System.out.println("three"); }
     // must be maintained public:

    @Override
    public void sayOne() {
        System.out.println("one");
    }

    @Override
    public void sayTwo() {
        System.out.println("two");
    }

    @Override
    public void sayThree() {
        System.out.println("three");
    }
}