package dsanewseries.top10arrayquestions;

import java.util.*;

public class Findallduplicateelements {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> list = Arrays.stream(arr).boxed().toList();
        list.stream().filter(e-> Collections.frequency(list , e) > 1).distinct().forEach(System.out::println);
    }

//    int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
//    Map<Integer , Integer> map = new HashMap<>();
//        for(int i : arr){
//        if(map.containsKey(i)){
//            map.put(i , map.get(i) + 1);
//        }else {
//            map.put(i , 1);
//        }
//    }
//        map.entrySet().stream().filter(e->e.getValue() > 1).forEach(e-> System.out.println(e.getKey()));
}
