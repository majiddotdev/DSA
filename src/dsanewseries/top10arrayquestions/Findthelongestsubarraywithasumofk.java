package dsanewseries.top10arrayquestions;

import java.util.Arrays;

public class Findthelongestsubarraywithasumofk {
    public static void main(String[] args) {
        int []arr =  {1, 2, 3, 4, 5};
        int k = 9;
        int []arr1 = findthelongestsubarraywithasumofk(arr , k);
        System.out.println(Arrays.toString(arr1));

    }

    private static int[] findthelongestsubarraywithasumofk(int[] arr, int k) {
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i + 1; j < arr.length ; j++){
                if(arr[i] + arr[j] ==k){
                    return new int[]{i , j};
                }
            }
        }
        return new int[]{0};
    }
}
