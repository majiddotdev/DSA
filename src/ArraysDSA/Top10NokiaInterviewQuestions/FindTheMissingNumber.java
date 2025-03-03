package ArraysDSA.Top10NokiaInterviewQuestions;

public class FindTheMissingNumber {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 9, 10};
        int n = 10;
        System.out.println(findTheMissingNumber(arr, n));

    }

    private static int findTheMissingNumber(int[] arr, int n) {
        int sumOfArray = 0;
        for (int i : arr) {
            sumOfArray += i;
        }
        return n * (n + 1) / 2 - sumOfArray;
    }
}
