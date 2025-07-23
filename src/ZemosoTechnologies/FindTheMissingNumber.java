package ZemosoTechnologies;

public class FindTheMissingNumber {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 4, 5};
        int length  = nums.length ;
        int number = (length + 1 ) * (length + 2) / 2;
        for (int num : nums) {
            number = number - num;
        }
        System.out.println(number);



    }
}
