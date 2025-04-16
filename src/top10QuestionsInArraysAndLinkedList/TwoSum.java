package top10QuestionsInArraysAndLinkedList;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
//        Question:
//        Given an array of integers nums and an integer target, return the indices of the two numbers such that they add up to target.
//        Example:
//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]


        //2nd approach
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        Map<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            int number = target - arr[i];
            if(map.containsKey(number)){
                System.out.println(map.get(number) + "  "+ i);
            }
            map.put(arr[i] , i);
        }






























//  first approach
//
//        int[] arr = {2, 9, 11, 15};
//        int target = 91;
//        System.out.println(Arrays.toString(returnIndices(arr, target)));
//
//    }
//
//    private static int[] returnIndices(int[] arr, int target) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == target) {
//                return new int[]{i};
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length; j++) {
//                if (arr[i] + arr[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return new int[]{0};
    }
}
