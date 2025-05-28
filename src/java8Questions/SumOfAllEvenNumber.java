package java8Questions;

import java.util.Arrays;

public class SumOfAllEvenNumber {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10};
        Integer k = Arrays.stream(arr1).boxed().filter(e->e % 2 == 0).reduce(Integer::sum).get();
        System.out.println(k);
    }
}
