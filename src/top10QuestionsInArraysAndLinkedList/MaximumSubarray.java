package top10QuestionsInArraysAndLinkedList;

public class MaximumSubarray {
    public static void main(String[] args) {
//        2. Maximum Subarray (Kadane’s Algorithm)
//        Question:
//        Find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
//
//                Example:
//        Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//        Output: 6
//        Explanation: [4,-1,2,1] has the largest sum = 6.

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int sum = 0, max_sum = Integer.MIN_VALUE;
        for (int j : arr) {
            sum += j;
            if (sum > max_sum) {
                max_sum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println(max_sum);
    }
}
