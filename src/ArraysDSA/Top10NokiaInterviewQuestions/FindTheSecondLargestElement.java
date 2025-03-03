package ArraysDSA.Top10NokiaInterviewQuestions;

public class FindTheSecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8};

        if (arr.length < 2) {
            System.out.println("No second largest element");
            return;
        }

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num < firstLargest && num > secondLargest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element");
        } else {
            System.out.println("Second largest element: " + secondLargest);
        }
    }

}
