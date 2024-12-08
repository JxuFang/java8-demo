package com.demo.java8.generics.wildcards;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundWildcards {


    public static void main(String[] args) {

        // 通配符情况
        method1();

        // 类型参数情况
        List<Number> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2.0);
        numbers.add(3.0f);
        method2(numbers, 1);
    }

    private static void method1() {
        List<Number> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2.0);
        numbers.add(3.0f);
        List<? extends Number> newNumbers = numbers;
        Number number = newNumbers.get(0);
        newNumbers.remove(0);
//        newNumbers.add(1); // compile error, List<? extends Number>表示了多种类型(List<Integer>, List<Double>, List<Number> 等)，
                             //                添加指定类型可能导致类型不安全
        System.out.println(newNumbers);

        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        List<? extends Number> newNumbers2 = integers;
        newNumbers2.get(0);
//        List<Number> numberList = integers; // compile error, List<Number> 并不是 List<Integer> 的父类

    }

    private static <T extends Number> void method2(List<T> list, T element) {

        Number number = list.get(0);
        list.remove(0);
        list.add(element); // <T extends Number> 只表示了 多种类型中的一种，自然可以往其中添加 T 类型的 element
        System.out.println(list);
    }
}