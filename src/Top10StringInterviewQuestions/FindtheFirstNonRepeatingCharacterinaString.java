package Top10StringInterviewQuestions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindtheFirstNonRepeatingCharacterinaString {
    public static void main(String[] args) {
        System.out.println(firstCharacter("leetcode"));
    }

    private static char firstCharacter(String leetcode) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < leetcode.length(); i++) {
            if (map.containsKey(leetcode.charAt(i))) {
                map.put(leetcode.charAt(i), map.get(leetcode.charAt(i)) + 1);
            } else {
                map.put(leetcode.charAt(i), 1);
            }
        }

        return map.entrySet().stream().filter(e -> e.getValue() == 1).map(e -> e.getKey()).findFirst().get();

    }
}
