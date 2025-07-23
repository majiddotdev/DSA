package ZemosoTechnologies;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int [] nums1 = {1, 3, 5};
        int m = 3;

        int [] nums2 = {2, 4, 6};
        int n = 3;

        int[] nums = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                nums[k++] = nums1[i++];
            } else {
                nums[k++] = nums2[j++];
            }
        }
        while (i < m) nums[k++] = nums1[i++];
        while (j < n) nums[k++] = nums2[j++];

        System.out.println(Arrays.toString(nums));


    }
}
