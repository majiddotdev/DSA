package LeetCode60days;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int left = 1, right = 1;
        while (right < arr.length) {
            if (arr[right] != arr[left -1] ) {
                arr[left++] = arr[right];
            }
            right++;
        }
        System.out.println(left);
        System.out.println(Arrays.toString(Arrays.copyOf(arr , left)));
        System.out.println(Arrays.toString(arr));


//        Set<Integer> set = new HashSet<>();
//        for(int i : arr){
//            set.add(i);
//        }
//        int[] newArray = new int[set.size()];
//        int count = 0;
//        for(int i : set){
//            newArray[count++] = i;
//        }
//        System.out.println(Arrays.toString(newArray));

    }
}
