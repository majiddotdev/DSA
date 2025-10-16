package Top_Fifty_Questions_in_dsa;

import java.util.Arrays;

public class MoveAllZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int left = 0,  length = arr.length;
        for (int i = 0; i < length; i++) {
            if (arr[i] != 0 )
                arr[left ++] = arr[i];
        }
        while (left < length){
            arr[left ++] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }
}
