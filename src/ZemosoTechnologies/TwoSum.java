package ZemosoTechnologies;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int element = target - nums[i];
            if (map.containsKey(element)) {
                System.out.println( map.get(element) + " " + i);
            } else {
                map.put(nums[i], i);
            }

        }
//
//        for(int i = 0 ; i < nums.length ; i++){
//            for(int j = i + 1 ; j < nums.length ; j++){
//                if(nums[i] + nums[j] == target){
//                    System.out.println( i + " " +  j);
//
//                }
//            }
//        }

    }
}
