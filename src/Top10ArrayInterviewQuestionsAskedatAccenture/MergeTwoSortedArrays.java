package Top10ArrayInterviewQuestionsAskedatAccenture;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 7, 8, 10, 11};
        int[] arr2 = {2, 3, 9};
        int n = arr1.length, m = arr2.length;
        int[] arr = new int[n + m];
        int left = 0, right = 0, count = 0;
        while (left < n && right < m) {
            if (arr1[left] < arr2[right]) {
                arr[count++] = arr1[left++];
            } else
                arr[count++] = arr2[right++];
        }
        while (left < n) {
            arr[count++] = arr1[left++];
        }
        while (right < m) {
            arr[count++] = arr2[right++];
        }
        System.out.println(Arrays.toString(arr));

    }
}
