package StringDSA;

import java.util.*;
import java.util.stream.Collectors;

public interface FindDuplicateCharactersInAString {
    public static void main(String[] args) {
        String str = "programming";
        String[] arr = str.split("");
        Map<String, Long> map  = Arrays.stream(arr).collect(Collectors.groupingBy(e->e ,Collectors.counting()));
        map.entrySet().stream().filter(e->e.getValue() > 1).forEach(e-> System.out.print(e.getKey() + " "));

    }
}
