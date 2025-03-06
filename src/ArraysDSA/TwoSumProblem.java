package ArraysDSA;

import java.util.Arrays;

public class TwoSumProblem {
    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 18;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    private static int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            if (nums[left] + nums[right] == target) {
                return new int[]{nums[left], nums[right]};
            } else if (nums[left] + nums[right] > target) {
                right--;
            } else if (nums[left] + nums[right] < target) {
                left++;

            }
        }
        return new int[]{};
    }


}
