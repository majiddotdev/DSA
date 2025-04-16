package top10QuestionsInArraysAndLinkedList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindUniqueWordsInAStringAndSortThem {
    public static void main(String[] args) {
        String str = "java is fun java is unique";
//        Arrays.stream(str.trim().toLowerCase().split("\\s+")).distinct().sorted().forEach(System.out::println);

       String k =  Arrays.stream(str.trim().toLowerCase().split("\\s+")).filter(e-> Collections.frequency(List.of(str.split("\\s+")) , e ) < 2).sorted().collect(Collectors.joining(" "));
        System.out.println(k);
    }
}
