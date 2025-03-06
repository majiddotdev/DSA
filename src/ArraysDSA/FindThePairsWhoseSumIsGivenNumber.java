package ArraysDSA;

import java.util.Arrays;

public class FindThePairsWhoseSumIsGivenNumber {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 9, 15, 2, 8, 3, 4, 11};
        int sum = 17;
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            if (arr[left] + arr[right] == sum) {
                System.out.print("{" + arr[left] + " " + arr[right] + "}");
                left++;
                right--;
            } else if (arr[left] + arr[right] > sum) {
                right--;
            } else if (arr[left] + arr[right] < sum) {
                left++;
            }
        }


//        for(int i = 0 ; i < arr.length ; i ++){
//            for(int j = i +1 ; j < arr.length ; j++){
//                if(arr[i] + arr[j] == sum){
//                    System.out.print("{" + arr[i]  + " " + arr[j] + "}");
//                }
//            }
//        }
    }
}
