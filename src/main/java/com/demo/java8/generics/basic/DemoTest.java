package com.demo.java8.generics.basic;

import java.util.ArrayList;
import java.util.List;

/**
 * javac DemoTest.java
 * javap -c DemoTest.class
 *
 * The compiler implicitly adds casts
 * bytecode instruction:
 * 29: checkcast     #11                 // class java/lang/String
 *
 * -------
 * javap -v DemoTest.class
 *
 * Constant pool:
 *
 *   #13 = Utf8               nameList
 *   #14 = Utf8               Ljava/util/List;
 *   #15 = Utf8               Signature
 *   #16 = Utf8               Ljava/util/List<Ljava/lang/String;>;
 *
 *   class file record an info that nameList is String
 */
public class DemoTest {

    private List<String> nameList;

    public DemoTest() {
        nameList = new ArrayList<String>();
    }

    public List<String> getNameList() {return nameList;}

    public static void main(String[] args) {
        DemoTest demoTest = new DemoTest();
        List<String> nameList = demoTest.getNameList();
        nameList.add("123");
//        nameList.add(123);// compile error
        String str = nameList.get(0);  // don't need to cast
    }
}