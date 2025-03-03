package ArraysDSA.Top10NokiaInterviewQuestions;

import java.util.Arrays;

public class RotateAnArrayByKPlaces {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3 % arr.length;
        swapAnArray(arr, 0, k -1);
        swapAnArray(arr, k , arr.length - 1);
        swapAnArray(arr, 0, arr.length - 1);


        System.out.println(Arrays.toString(arr));

    }

    static void swapAnArray(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

    }
}
