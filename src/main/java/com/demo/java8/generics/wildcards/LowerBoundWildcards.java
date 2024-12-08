package com.demo.java8.generics.wildcards;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundWildcards {

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        List<? super Integer> list = integers;
        list.add(4);
//        Integer value = list.get(0); // compile error, List<? super Integer> 实际可能是多种类型(List<Integer>,
                                       // List<Number>, List<Object> 等)，list.get(0)是无法知道 元素的类型，只能用Object
        Object object = list.get(0);
        System.out.println("object: " + object);

        System.out.println(list);

        List<Number> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2.0);
        numbers.add(3.0f);
        List<? super Integer> list1 = numbers;
        list1.add(4);
//        Integer value = list1.get(0);
        Object object1 = list1.get(2);
        System.out.println("object1: " + object1);
        System.out.println(list1);
    }

}