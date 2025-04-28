package dsaSeriesbyShradha;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        long k = map.values().stream().max(Integer::compareTo).get();
        map.entrySet().stream().filter(e->e.getValue() == k).forEach(e-> System.out.println(e.getKey()));

    }
}
