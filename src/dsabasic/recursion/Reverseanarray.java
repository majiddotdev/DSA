package dsabasic.recursion;

import java.util.Arrays;

public class Reverseanarray {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        reverseArray(0, arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverseArray(int i, int[] arr, int n) {
        if (i >= n / 2) return;
        swap1(i, n - 1 - i, arr);
        reverseArray(i + 1, arr, n);

    }

    private static void swap1(int i, int i1, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }
}
