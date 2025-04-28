package Top10ArrayInterviewQuestionsAskedatAccenture;

public class FindthesubarraywiththemaximumsumUsingKadansAlgo {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int sum = 0, max_sum = Integer.MIN_VALUE;
        for (int i : arr) {
            sum += i;
            if (sum > max_sum) {
                max_sum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println(max_sum);
    }
}
