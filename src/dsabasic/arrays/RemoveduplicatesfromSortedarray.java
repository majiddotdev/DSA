package dsabasic.arrays;

import java.util.HashSet;
import java.util.Set;

public class RemoveduplicatesfromSortedarray {
    public static void main(String[] args) {
        int[] num = {0, 0, 3, 3, 5, 6};

        int j = 0;
        for (int i = 1; i < num.length; i++) {
            if (num[i] != num[j]) {
                j++;
                num[j] = num[i];
            }
        }
        j++;
        System.out.println(j);


//        int unique = getUnique(num);
//        System.out.println(unique);
//    }
//
//    private static int getUnique(int[] num) {
//        Set<Integer> set = new HashSet<>();
//        for (int i : num)  set.add(i);
//        return set.size();
    }
}
