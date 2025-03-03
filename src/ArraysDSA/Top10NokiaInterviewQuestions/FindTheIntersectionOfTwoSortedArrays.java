package ArraysDSA.Top10NokiaInterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTheIntersectionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 6}, arr2 = {2, 3, 5, 7};
        System.out.println(findIntersectionTwoPointers(arr1, arr2));

    }

    private static List<Integer> findIntersectionTwoPointers(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                list.add(arr1[i]);
                i++;
                j++;
            }
        }
        return list;
    }

}
