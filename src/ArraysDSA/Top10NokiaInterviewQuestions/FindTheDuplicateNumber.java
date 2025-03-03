package ArraysDSA.Top10NokiaInterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        Map<Integer , Long> map ;
        map = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(e -> e , Collectors.counting()));
        map.entrySet().stream().filter(e->e.getValue() > 1).forEach(e-> System.out.println(e.getKey()));
    }
}


//Map<Integer , Integer> map = new HashMap<>();
//        for (int i : arr){
//        if(map.containsKey(i)){
//        map.put(i , map.get(i) + 1);
//        }else {
//        map.put(i , 1);
//            }
//                    }
//                    map.entrySet().stream().filter(e->e.getValue() > 1).forEach(e -> System.out.println(e.getKey()));