package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
    List<Integer> numsList = Arrays.asList(1, 2, 3, 3, 4, 5, 5, 6);

        List<Integer> collect = numsList.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);
    }
}