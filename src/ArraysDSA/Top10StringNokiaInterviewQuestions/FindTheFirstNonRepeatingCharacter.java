package ArraysDSA.Top10StringNokiaInterviewQuestions;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindTheFirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "swiss";
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }
        for (Map.Entry<Character, Integer> newMap : map.entrySet()) {
            if (newMap.getValue() == 1) {
                System.out.println(newMap.getKey());
                break;
            }
        }
    }
}
