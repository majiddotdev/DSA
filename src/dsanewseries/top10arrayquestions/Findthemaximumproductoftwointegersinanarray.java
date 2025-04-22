package dsanewseries.top10arrayquestions;

public class Findthemaximumproductoftwointegersinanarray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 8, 7};
        int largestElement = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE, product;
        for (int i : arr) {
            if (i > largestElement) {
                secondLargest = largestElement;
                largestElement = i;
            } else if (i > secondLargest && i < largestElement) {
                secondLargest = i;
            }
        }
        product = largestElement * secondLargest;
        System.out.println(product);

    }
}
