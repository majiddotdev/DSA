package dsabasic;

import java.util.ArrayList;
import java.util.List;

public class findAllDivisors {
    public static void main(String[] args) {
        int n1 = 6;
        List<Integer> list1 = getDivisors(n1);
        System.out.println(list1);



    }

    private static List<Integer> getDivisors(int n1) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0) list.add(i);
        }
        return list;

    }
}
