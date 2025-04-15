import java.util.Arrays;

public class productExceptSelf {
    public static void main(String[] args) {
        int []nums = {1,2,3,4}, output = new int[nums.length];

        output[0] = 1;
        for(int i = 1 ; i < nums.length ; i++){
            output[i] = output[i - 1] * nums[i - 1];
        }

        int right = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            output[i] = output[i] * right;
            right *= nums[i];
        }

        System.out.println(Arrays.toString(output));




















//        int product ;
//        for(int i = 0 ; i < nums.length ; i++){
//             product = 1;
//            for(int j = 0 ; j < nums.length ; j++){
//                 if(i != j){
//                     product = product * nums[j];
//                 }
//            }
//            output[i] = product;
//
//        }
        System.out.println(Arrays.toString(output));

    }
}
