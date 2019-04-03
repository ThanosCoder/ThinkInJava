package io.sage.tij.ch09interface.ex02;

/**
 * TODO
 *
 * @author: Sage
 * @version:
 * @date: 2019-02-08 19:20
 **/
abstract class DemoAbstractedClass {
    public String str = "hello";    
}

public  class NoAbstractedMethodClass {
    public static void main(String[] args) {
        DemoAbstractedClass obj = new DemoAbstractedClass(){};
        System.out.println(obj.str);
    }
   
    
}
