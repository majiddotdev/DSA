package TwoPointer;

import java.lang.reflect.Array;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = { 0 , 0 , 1 , 1 , 1 , 2 , 2 , 3 , 3 , 4};
        int count = 1 , left = 0 , right = 1 , size = nums.length ;
        while (right < size){
            if(nums[left] != nums[right]){
                nums[left] = nums[right];
                count ++;
            }
            right++;
        }
        System.out.println(count);
    }

}
