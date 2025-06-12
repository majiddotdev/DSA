package StringDSA;

import java.util.HashMap;
import java.util.Map;

public class findSecondHighestRepeatedCharacter {
    public static void main(String[] args) {
        String[] ch = {"a", "b", "c", "a", "b", "a" , "b" , "c" , "a"};
        Map<String, Integer> map = new HashMap<>();
        for (String s : ch) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        System.out.println(map.entrySet().stream().distinct().skip(1).findFirst().get().getKey());
    }
}
