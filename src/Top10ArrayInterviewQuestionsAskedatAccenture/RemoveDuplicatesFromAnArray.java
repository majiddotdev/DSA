package Top10ArrayInterviewQuestionsAskedatAccenture;

import java.util.Arrays;

public class RemoveDuplicatesFromAnArray {
    public static void main(String[] args) {
        int[] arr = { 1 , 2 , 3 , 4 , 5 , 1 , 4 , 5 , 1 , 9};
        Arrays.stream(arr).boxed().distinct().forEach(System.out::println);
    }
}
