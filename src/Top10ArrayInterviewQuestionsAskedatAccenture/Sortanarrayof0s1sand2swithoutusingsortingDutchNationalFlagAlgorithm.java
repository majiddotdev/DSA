package Top10ArrayInterviewQuestionsAskedatAccenture;

import java.util.Arrays;

public class Sortanarrayof0s1sand2swithoutusingsortingDutchNationalFlagAlgorithm {
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 2, 0};
        int zeros = 0, ones = 0, twos = 0;
        int n = arr.length;
        for (int i : arr) {
            if (i == 0) zeros++;
             else if (i == 1) ones++;
             else twos++;
        }
        for(int i = 0 ; i < zeros ; i++){
            arr[i] = 0;
        }
        for(int i = zeros ; i < (zeros + ones) ; i++){
            arr[i] = 1;
        }
        for(int i = (zeros + ones) ; i < n ; i++){
            arr[i] = 2;
        }

        System.out.println(Arrays.toString(arr));
    }
}
