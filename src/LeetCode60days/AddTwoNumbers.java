package LeetCode60days;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddTwoNumbers {
    public static void main(String[] args) {
        int[] l1 = {9,9,9,9,9,9,9} , l2 = {9,9,9,9};
        StringBuffer number = new StringBuffer();
        StringBuffer number1 = new StringBuffer();
        List<Integer> list = new ArrayList<>();
        int finalNumber  , reverse = 0;
        for (int i : l1) {
            number.append(i);
        }
        for (int i : l2) {
            number1.append(i);
        }
        finalNumber = Integer.parseInt(number.reverse().toString()) + Integer.parseInt(number1.reverse().toString());
        while (finalNumber > 0){
            reverse = (reverse * 10 ) + finalNumber % 10;
            finalNumber = finalNumber / 10;
        }
        Arrays.stream(String.valueOf(reverse).split("")).forEach(e->list.add(Integer.valueOf(e)));


        System.out.println(reverse);
        System.out.println(list);

    }

}
