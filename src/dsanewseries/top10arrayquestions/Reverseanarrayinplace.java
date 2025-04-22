package dsanewseries.top10arrayquestions;

import java.util.Arrays;

public class Reverseanarrayinplace {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int left = 0 , right = arr.length -1;
        while (left < right){
            int temp = arr[left];
            arr[left ] = arr[right];
            arr[right] = temp;
            left++;
            right --;
        }
        System.out.println(Arrays.toString(arr));




//        for (int i = arr.length -1 ; i >= 0 ; i--){
//            System.out.print(arr[i] + " ");
//
//        }
    }
}
