package com.julina.java;

/**
 * Created by jmaharjan on 1/6/17.
 */

public class Lamda {

/*
    public static void main(String[] args) {
        String name = "Julina";
        test runnable = () -> System.out.println("Hello "+ name);
        runnable.stop();
    }
*/


    public interface test{
//        public void run();
        public void stop();
    }

}

class Calculator {

    interface IntegerMath {
        int operation(int a, int b);
    }

    public int operateBinary(int a, int b, IntegerMath op) {
        return op.operation(a, b);
    }

    public static void main(String... args) {

        Calculator myApp = new Calculator();
//        IntegerMath addition = (x, y) -> x + y;
//        IntegerMath subtraction = (a, b) -> a - b;
//        System.out.println("40 + 2 = " +
//                myApp.operateBinary(40, 2, addition));
//        System.out.println("20 - 10 = " +
//                myApp.operateBinary(20, 10, subtraction));
    }
}
