package Top10ArrayInterviewQuestionsAskedatAccenture;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 7, 8, 10};
        int[] arr2 = {2, 3, 9};
        int[] arr = new int[arr1.length + arr2.length];
        int count = arr1.length;
        for(int i = 0 ; i < arr1.length ; i++){
            arr[i] = arr1[i];
        }
        for(int i = 0 ; i < arr2.length ; i++){
            arr[count ++] = arr2[i];
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
