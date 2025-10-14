package tahadiy_30_ywman;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Findtherepeatingandmissingnumber {
    public static void main(String[] args) {
//        Input: nums = [3, 5, 4, 1, 1]
//
//        Output: [1, 2]
//
//        Explanation:
//
//        1 appears two times in the array and 2 is missing from nums

        int[] arr = {3, 5, 4, 1, 1};
        int length = arr.length;
        Arrays.sort(arr);
        int index = 0;
        for (int i = 1; i <= length; i++) {
            if (arr[index++] != i) {
                System.out.println(STR."Missing element => \{i}");
            }
        }


        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        map.entrySet().stream().filter(e-> e.getValue() > 1).forEach( e-> System.out.println(e.getKey()));


    }
}
