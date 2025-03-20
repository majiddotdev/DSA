package PWCInterviewQuestions;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        int n = arr.length + 1;
        int sum = (n * ( n - 1)) / 2;
        for(int i : arr){
            sum = sum - i;
        }
        System.out.println("missing element " + sum);

    }
}
