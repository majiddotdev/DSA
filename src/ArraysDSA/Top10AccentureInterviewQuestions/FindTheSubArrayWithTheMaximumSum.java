package ArraysDSA.Top10AccentureInterviewQuestions;

public class FindTheSubArrayWithTheMaximumSum {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int sum = 0, maxSum = Integer.MIN_VALUE, start = -1, end = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > maxSum) {
                maxSum = sum;
                if (start == -1) {
                    start = i;
                }
                end = i;
            }
            if (sum < 0) {
                start = -1;
                sum = 0;
            }
        }
        for (int i = start ; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(maxSum);

    }
}
