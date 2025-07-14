package dsabasic.arrays;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 0, 5, 2};
        int j = 0;
        for(int k = 0 ; k < arr.length ; k++) {
            if (arr[k] != 0) {
                if (k != j) {
                    int temp = arr[k];
                    arr[k] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));


    }

}
