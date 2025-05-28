package java8Questions;

import java.util.List;
import java.util.stream.Collectors;

public class JoinAllTheWords {
    public static void main(String[] args) {
        List<String> list = List.of("Hello" , " " , "world" , "!");
        list.stream().collect(Collectors.joining(""));
    }
}
