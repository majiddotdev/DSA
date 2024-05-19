public class Max_Sum_Of_Sub_Arrays {
    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};
        System.out.println("the max sum is : "+ maxSubArraySum(arr));
    }

    public static int maxSubArraySum(int[] arr) {
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if (sum > max_sum)
                    max_sum = sum;
            }
        }
    return max_sum;
    }
}