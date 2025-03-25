package java8Questions;

import java.util.List;
import java.util.stream.Collectors;

public class moveAllZeroesToTheRightOfTheList {
    public static void main(String[] args) {
        List<Integer> list = List.of(34, 0, 2, 89, 0, 56, 17, 4, 0, 63);
        long coutZeors = list.stream().filter(e->e == 0).count();

       List<Integer> newList = list.stream().filter(e -> e != 0).collect(Collectors.toList());
        System.out.println(newList);
       for(int i = 0 ; i < coutZeors ; i++){
           newList.add(0);
       }
        System.out.println(newList);

    }
}
