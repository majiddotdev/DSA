package dsanewseries.top10arrayquestions;

public class Findthesecondlargestelement {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 20};
        int largestElement = Integer.MIN_VALUE , secondLargest = Integer.MIN_VALUE;
        for(int i : arr){
            if(i > largestElement){
                secondLargest = largestElement;
                largestElement = i;
            }
            else if(i > secondLargest && i < largestElement){
                secondLargest = i;
            }
        }
        System.out.println(secondLargest);
    }
}
