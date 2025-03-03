package ArraysDSA.Top10NokiaInterviewQuestions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindTheMissingNumber {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 9, 10};
        int n = 10;
        System.out.println(findTheMissingNumber(arr, n));
//        Arrays.stream(arr).sum();

    }

    private static int findTheMissingNumber(int[] arr, int n) {
        int sumOfArray = 0;
        for (int i : arr) {
            sumOfArray += i;
        }
        return n * (n + 1) / 2 - sumOfArray;
    }




//    private static int findMissingNumberXOR(int[] arr, int n) {
//        int xor1 = 0, xor2 = 0;
//
//        for (int i = 1; i <= n; i++) {
//            xor1 ^= i;
//        }
//
//        for (int num : arr) {
//            xor2 ^= num;
//        }
//
//        return xor1 ^ xor2;
//    }
}
