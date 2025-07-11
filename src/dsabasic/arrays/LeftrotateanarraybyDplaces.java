package dsabasic.arrays;

import java.util.Arrays;

public class LeftrotateanarraybyDplaces {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int k = 12;
        k = k % nums.length;
        if (k == 0) {
            System.out.println(Arrays.toString(nums));
            return;
        }
        rotateArray(0, k - 1, nums);
        rotateArray(k, nums.length - 1, nums);
        rotateArray(0, nums.length - 1, nums);

        System.out.println(Arrays.toString(nums));
    }

    private static void rotateArray(int i, int i1, int[] nums) {
        while (i < i1) {
            int temp = nums[i];
            nums[i] = nums[i1];
            nums[i1] = temp;
            i++;
            i1--;
        }
    }
}
