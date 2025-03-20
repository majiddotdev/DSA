package PWCInterviewQuestions;

import java.util.Arrays;

public class RotateArrayByKSteps {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 10 % arr.length;
        swapArray(arr , 0 , k -1);
        swapArray(arr , k  , arr.length -1);
        swapArray(arr , 0 , arr.length -1);
        System.out.println(Arrays.toString(arr));


    }

    private static void swapArray(int[] arr, int left, int right) {
        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left ++;
            right --;
        }

    }
}
