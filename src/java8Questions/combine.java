package java8Questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class combine {
    public static void main(String[] args) {

//        d={"A":[1,2],"p":[2,3]}
//        out_put{1:"A",2:["A","B"],3:"B"} using python
        Map<Character, Integer[]> map = new HashMap<>();
        Map<Integer, Character[]> map1 = new HashMap<>();

        map.put('A', new Integer[]{1, 2});
        map.put('P', new Integer[]{2, 3});

        for (Map.Entry<Character, Integer[]> map2 : map.entrySet()) {
            for (int i = 0; i < map2.getValue().length; i++) {
                if (!map1.containsKey(map2.getValue()[i]))
                    map1.put(map2.getValue()[i], new Character[]{map2.getKey()});
                else
                    map1.put(map2.getValue()[i],  map1.get(map2.getValue()[i]));


            }

        }

        map1.entrySet().stream().map(e->e.getValue()).forEach(e-> System.out.println(e.length));




    }
}
