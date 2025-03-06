package ArraysDSA.Top10AccentureInterviewQuestions;

public class FindTheSubArrayWithTheMaximumSum {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int sum = 0, maxSum = Integer.MIN_VALUE;
        for (int j : arr) {
            sum += j;
            if (sum > maxSum) {
                maxSum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println(maxSum);

    }
}
