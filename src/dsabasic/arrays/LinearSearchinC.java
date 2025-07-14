package dsabasic.arrays;

import java.util.Map;

public class LinearSearchinC {
    public static void main(String[] args) {
        int[] arr={ 1 ,2 ,3 ,4, 5} ;
        int num = 3;
        System.out.println(findIndex(arr , num));


    }

    private static int findIndex(int[] arr, int num) {
        int left = 0 , right = arr.length - 1 ;
        while (left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == num){
                return  mid;
            }else if(arr[mid] < num){
                left = mid + 1;
            }else {
                right = mid -1;
            }
        }
















//        for(int i = 0 ; i < arr.length ; i++){
//            if(arr[i] == num){
//                return i;
//            }
//        }
        return -1;
    }
}
