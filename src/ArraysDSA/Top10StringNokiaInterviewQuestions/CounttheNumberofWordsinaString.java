package ArraysDSA.Top10StringNokiaInterviewQuestions;

import java.util.Arrays;

public class CounttheNumberofWordsinaString {
    public static void main(String[] args) {
        String str = "  Hello   World!  ";
       long k =  Arrays.stream(str.trim().split("\\s+ ")).count();
        System.out.println(k);
    }
}
