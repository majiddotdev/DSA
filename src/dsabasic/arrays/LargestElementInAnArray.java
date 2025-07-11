package dsabasic.arrays;

import java.util.Arrays;

public class LargestElementInAnArray {
    public static void main(String[] args) {
        int[] nums = {3, 3, 6, 1};
        int number = Integer.MIN_VALUE;

        for(int i : nums){
            if(i > number){
                number = i;
            }
        }
        System.out.println(number);

//        Arrays.sort(nums);
//        System.out.println(nums[nums.length -1]);




    }
}
