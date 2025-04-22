package dsanewseries.top10arrayquestions;

import java.util.HashMap;
import java.util.Map;

public class Findfrequencyofeachelement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4};
        Map<Integer , Integer> map = new HashMap<>();
        for(int i : arr){
            if(map.containsKey(i)){
                map.put(i , map.get(i) + 1);
            }else {
                map.put(i , 1);
            }
        }
        System.out.println(map);
    }
}
