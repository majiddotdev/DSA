package ArraysDSA.Top10NokiaInterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTheIntersectionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 6}, arr2 = {2, 3, 5, 7};
        System.out.println(findTheIntersectionOfTwoSortedArrays(arr1, arr2));

    }

    private static List<Integer> findTheIntersectionOfTwoSortedArrays(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < arr1.length ; i++){
            int finalI = i;
            if( Arrays.stream(arr2).anyMatch(n -> n == arr1[finalI])){
                list.add(arr1[i]);

            }
        }
        return list;
    }
}
