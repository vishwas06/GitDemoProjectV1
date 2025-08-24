package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args){
            //Sort the list in descending order

            List<Integer> numsList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

            List<Integer> collect = numsList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

            System.out.println(collect);
    }
}
