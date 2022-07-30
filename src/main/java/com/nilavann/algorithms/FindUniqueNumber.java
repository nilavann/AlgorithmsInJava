package com.nilavann.algorithms;

import java.util.List;

public class FindUniqueNumber {

    public static Integer findUniqueNumber(List<Integer> list){

       return list.stream().reduce((num1, num2) -> num1 ^= num2).orElse(0);

    }
}
