package PWCInterviewQuestions;

public class FindTheSecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 20, 15};
        int large = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int j : arr) {
            if (j > large) {
                second = large;
                large = j;
            } else if (j > second && j < large) {
                second = j;

            }
        }
        System.out.println(second);


    }
}
