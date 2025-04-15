import java.util.Arrays;

public class productExceptSelf {
    public static void main(String[] args) {
        int []nums = {-1,1,0,-3,3}, output = new int[nums.length];
        int product ;
        for(int i = 0 ; i < nums.length ; i++){
             product = 1;
            for(int j = 0 ; j < nums.length ; j++){
                 if(i != j){
                     product = product * nums[j];
                 }
            }
            output[i] = product;

        }
        System.out.println(Arrays.toString(output));

    }
}
