import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "abcdcaf";
        Map<Character, Integer> countMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (countMap.containsKey(str.charAt(i))) {
                countMap.put(str.charAt(i), countMap.get(str.charAt(i)) + 1);
            } else {
                countMap.put(str.charAt(i), 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeating character: " + entry.getKey());
                break;
            }
        }
    }
}
