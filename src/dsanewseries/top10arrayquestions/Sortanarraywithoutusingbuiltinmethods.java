package dsanewseries.top10arrayquestions;

import java.util.Arrays;

public class Sortanarraywithoutusingbuiltinmethods {
    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 13};
        for(int i = 0 ; i < arr.length - 1 ; i++){
            for(int j = 0 ; j < arr.length - i -1 ; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
