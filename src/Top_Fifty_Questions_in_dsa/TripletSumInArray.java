package Top_Fifty_Questions_in_dsa;

import java.util.HashMap;
import java.util.Map;

public class TripletSumInArray {
    public static void main(String[] args) {
        int[] arr = {12, 3, 4, 1, 6, 9};
        int sum = 24;

        int length = arr.length;

        for(int i = 0 ; i < length - 2 ; i ++){
            for(int j = i + 1 ; j < length - 1 ; j ++){
                for(int k = j + 1 ; k < length ; k ++){
                    if(arr[i] + arr[j] + arr[k] == sum){
                        System.out.println("[" + i + " " + j + " " + k + "]");
                    }
                }
            }
        }

    }
}
