package java8;

import java.util.Arrays;
import java.util.Collections;

public class FindthesecondhighestnumberinanarrayusingStreams {
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3 , 6 , 8 , 19 , 13 , 124};
        Integer k = Arrays.stream(arr).boxed().sorted((a , b) -> b -a).skip(1).findFirst().get();
        System.out.println(k);
    }
}
