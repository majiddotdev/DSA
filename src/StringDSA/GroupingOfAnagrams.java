package StringDSA;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingOfAnagrams {
    public static void main(String[] args) {
        List<String> list = List.of("cat" , "atc" , "like" , "ikel" , "food");
        Map<String , Long> map = list.stream().map(e->{
            String[] ch = e.split("");
            return Arrays.stream(ch).sorted().collect(Collectors.joining());
        }).collect(Collectors.groupingBy(e-> e, Collectors.counting()));
        System.out.println(map);
    }
}
