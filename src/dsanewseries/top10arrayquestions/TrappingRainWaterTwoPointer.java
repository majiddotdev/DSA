package dsanewseries.top10arrayquestions;


public class TrappingRainWaterTwoPointer {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int length = arr.length, sum = 0;
        int[] left = new int[length], right = new int[length];
        left[0] = arr[0];
        for (int i = 1; i < length; i++) {
            left[i] = Math.max(arr[i], left[i  - 1]);
        }
         right[length -1] = arr[length - 1];
        for (int i = length - 2; i >= 0; i--) {
            right[i] = Math.max(arr[i], right[i + 1]);
        }
        for(int i = 0 ; i < length ; i++){
            sum += (Math.min(left[i] , right[i]) - arr[i]);
        }

        System.out.println(sum);
    }
}
