package ArraysDSA.Top10NokiaInterviewQuestions;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {1 ,0, 1, 0, 3, 12};
        int temp1 = 0, temp2 = 0;
        while (temp2 != arr.length) {
            if (arr[temp2] != 0) {
                int temp = arr[temp1];
                arr[temp1] = arr[temp2];
                arr[temp2] = temp;
                temp1++;
            }
            temp2++;


        }
        System.out.println(Arrays.toString(arr));


//        int index = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != 0) {
//                arr[index] = arr[i];
//                index++;
//            }
//        }
//        for (int i = index; i < arr.length; i++) {
//            arr[i] = 0;
//        }
//        System.out.println(Arrays.toString(arr));

    }
}
