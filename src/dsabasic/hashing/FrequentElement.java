package dsabasic.hashing;

import java.util.HashMap;
import java.util.Map;

public class FrequentElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3 , 4 , 4 , 4 ,4};
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            if (map.containsKey(map.get(j))) {
                map.put(j, map.get(j) + 1);
            } else {
                map.put(j, 1);
            }
        }
        Map.Entry<Integer, Integer> maxEntry = map.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);

        if (maxEntry != null) {
            System.out.println("Most frequent element: " + maxEntry.getKey());
            System.out.println("Frequency: " + maxEntry.getValue());
        }

    }
}
