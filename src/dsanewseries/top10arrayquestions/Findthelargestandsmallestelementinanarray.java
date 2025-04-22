package dsanewseries.top10arrayquestions;

public class Findthelargestandsmallestelementinanarray {
    public static void main(String[] args) {
        int[] arr = {12, 3, 45, 7, 22, 89, 5};
        int largestElement = Integer.MIN_VALUE , smallestElement = Integer.MAX_VALUE;
        for (int j : arr) {
            if (j >= largestElement) {
                largestElement = j;
            }
            if (j <= smallestElement) {
                smallestElement = j;
            }
        }
        System.out.println("largest Element is : "+ largestElement);
        System.out.println("smallest Element is : "+ smallestElement);

    }
}
