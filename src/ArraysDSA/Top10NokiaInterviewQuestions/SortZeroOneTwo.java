package ArraysDSA.Top10NokiaInterviewQuestions;

import java.util.Arrays;

public class SortZeroOneTwo {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 2, 2, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
