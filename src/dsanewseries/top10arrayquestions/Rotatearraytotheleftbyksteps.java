package dsanewseries.top10arrayquestions;

import java.util.Arrays;

public class Rotatearraytotheleftbyksteps {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2 % arr.length;
        swapArrays(0, k - 1, arr);
        swapArrays(k, arr.length - 1, arr);
        swapArrays(0, arr.length - 1, arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void swapArrays(int i, int k, int[] arr) {
        while (i < k) {
            int temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;
            i++;
            k--;
        }
    }
}
