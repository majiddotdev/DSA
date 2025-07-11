package dsabasic.arrays;

public class SecondLargestElementinanArraywithoutsorting {
    public static void main(String[] args) {
        int[] nums = {8, 8, 7, 6, 5};
        if (nums.length < 2) System.out.println("the array does not have second highest element");
        int highest_element = Integer.MIN_VALUE, second_element = Integer.MIN_VALUE;
        for (int i : nums) {
            if (i > highest_element) {
                second_element = highest_element;
                highest_element = i;
            } else if (i != highest_element && i > second_element)
                second_element = i;
        }
        System.out.println(second_element);
    }
}
