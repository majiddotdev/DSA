package dsabasic.arrays;

import java.util.Arrays;

public class LeftRotateanarraybyoneplace {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int number  = nums[0];
        for(int i = 1 ; i < nums.length ; i++)
            nums[i - 1] = nums[i];
        nums[nums.length - 1] = number;
        System.out.println(Arrays.toString(nums));
    }
}
