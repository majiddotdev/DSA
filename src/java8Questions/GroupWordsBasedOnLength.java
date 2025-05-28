package java8Questions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsBasedOnLength {
    public static void main(String[] args) {
        List<String> list = List.of("apple" , "banana" , "pear" , "peach");
        Map<Integer, List<String>> ll = list.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(ll);

    }
}
