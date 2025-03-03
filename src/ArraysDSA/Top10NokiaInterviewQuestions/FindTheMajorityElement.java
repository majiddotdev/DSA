package ArraysDSA.Top10NokiaInterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class FindTheMajorityElement {
    public static void main(String[] args) {
        int[] arr = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int k = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
            } else {
                map.put(j, 1);
            }
        }
        for (Map.Entry<Integer, Integer> newMap : map.entrySet()) {
            if (newMap.getValue() > k) {
                k = newMap.getKey();
            }
        }
        System.out.println(k);

    }
}
