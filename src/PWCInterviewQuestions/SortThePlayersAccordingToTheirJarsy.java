package PWCInterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class SortThePlayersAccordingToTheirJarsy {
    public static void main(String[] args) {
        Map<Integer , String> map = new HashMap<>();
        map.put(1 , "abc");
        map.put(2 , "saba");
        map.put(3 , "hilal");
        map.put(4 , "majid");
        map.put(5 , "irfan");

        map.entrySet().stream().filter(e->e.getKey() % 2 == 0).forEach(e-> System.out.println(e.getValue()));

    }
}
