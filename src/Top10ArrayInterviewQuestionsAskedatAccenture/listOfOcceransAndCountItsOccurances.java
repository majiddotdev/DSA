package Top10ArrayInterviewQuestionsAskedatAccenture;

import java.util.HashMap;
import java.util.Map;

public class listOfOcceransAndCountItsOccurances {
    public static void main(String[] args) {
        String str = "java is good java is hard";
        String []ch = str.split("\\s+");
        Map<String , Integer> map = new HashMap<>();
        for (String s : ch) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        System.out.println(map);

    }
}
