package top10QuestionsInArraysAndLinkedList;

import java.util.HashMap;

public class findTheDuplicateNumber {
    public static void main(String[] args) {

//        4. Find the Duplicate Number
//        Question:
//        Given an array of integers nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that at least one duplicate number must exist. Find the duplicate one.
//
//        Example:
//        Input: nums = [3,1,3,4,2]
//        Output: 3

        int []nums = {3 , 1 , 3 , 4 , 2};
//        for(int i = 0 ; i < nums.length ; i++){
//            for(int j = i + 1 ; j < nums.length ; j++){
//                if(nums[i] == nums[j]){
//                    System.out.println(nums[i]);
//                    break;
//                }
//            }
//        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        map.entrySet().stream().filter(e->e.getValue() > 1).forEach(e-> System.out.println(e.getKey()));

    }
}
