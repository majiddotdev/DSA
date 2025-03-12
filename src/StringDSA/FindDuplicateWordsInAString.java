package StringDSA;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindDuplicateWordsInAString {
    public static void main(String[] args) {
        String str = "This is is a sample sample string with with duplicate duplicate words words.";
        Arrays.stream(str.split(" ")).filter(e-> Collections.frequency(List.of(str.split(" ")), e) > 1).distinct().forEach(System.out::println);
    }
}
