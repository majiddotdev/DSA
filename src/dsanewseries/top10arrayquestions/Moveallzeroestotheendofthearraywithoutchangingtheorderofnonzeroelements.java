package dsanewseries.top10arrayquestions;

import java.util.Arrays;

public class Moveallzeroestotheendofthearraywithoutchangingtheorderofnonzeroelements {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int count = 0;
        for (int i : arr) {
            if (i != 0)
                arr[count++] = i;

        }
        for (int i = count; i < arr.length; i++) {
            arr[i] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }
}
