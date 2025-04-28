import java.util.Arrays;
import java.util.Collections;

public class secondHighestNumberInAnArray {
    public static void main(String[] args) {
        int[] arr = { 1 , 4 , 8 , 19 , 8 , 9 , 9 , 19};
        long k = Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
        System.out.println(k);
    }
}
