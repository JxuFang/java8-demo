package com.demo.java8.lambda.basic;

import org.junit.Test;

import static org.junit.Assert.*;

public class FunInterfaceTest {

    /**
     * Variable used in lambda expression should be final or effectively final
     */
    @Test
    public void testVariableMustBeFinalInLambda() {
        String msg = "hello, world";
        msg = "change msg";
//        FunInterface fi = () -> System.out.println(msg);
    }

    @Test
    public void testBasic() {
//        Anonymous inner class
        hello(new FunInterface() {
            @Override
            public void hello() {
                System.out.println("hello before lambda expression");
            }
        });
//        use lambda expression
        hello(()-> System.out.println("hello after lambda expression"));

//        lambda expression is not the anonymous inner class but the functional interface
    }

    private void hello(FunInterface fun) {
        fun.hello();
    }

}