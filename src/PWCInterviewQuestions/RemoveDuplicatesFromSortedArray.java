package PWCInterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
         int uniqueIndex = 0;
         for(int i = 0 ; i < arr.length ; i++){
             if(arr[i] !=arr[uniqueIndex]){
                 uniqueIndex ++;
                 arr[uniqueIndex] = arr[i];
             }
         }
        System.out.println(uniqueIndex + 1);
        System.out.println(Arrays.toString(arr));





















//        long c = Arrays.stream(arr).distinct().count();
//        System.out.println(c);

    }
}
