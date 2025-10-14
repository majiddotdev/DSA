package ZemosoTechnologies;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 18;

        k = k % nums.length;
        rotateUpToKplales(0, k - 1, nums);
        rotateUpToKplales(k, nums.length - 1, nums);
        rotateUpToKplales(0, nums.length - 1, nums);

        System.out.println(Arrays.toString(nums));

    }

    private static void rotateUpToKplales(int i, int i1, int[] nums) {
        while (i < i1) {
            int temp = nums[i];
            nums[i] = nums[i1];
            nums[i1] = temp;
            i++;
            i1--;
        }
    }
}
