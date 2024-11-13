package com.demo.java8.lambda.predicate;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Student {

    private String name;
    private int age;
    private float score;
}