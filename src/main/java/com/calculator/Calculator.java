package com.calculator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Calculator {
    private Calculator(){
    }

    public static Calculator getInstance(){
        return new Calculator();
    }

    public int add(String numbers){

        List<Integer> numbsInteger = Arrays.stream(numbers.split(",")).map(
                Integer::valueOf).collect(Collectors.toList());

        return numbsInteger.stream().reduce(0, Integer::sum);
    }



}
