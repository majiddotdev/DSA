package ArraysDSA;


import java.util.Arrays;

public class Rearrangethearrayinalternatingpositiveandnegativeitems {
    public static void main(String[] args) {
        int[] arr = {3, 1, -2, -5, 2, -4};
        int[] newArray = new int[arr.length];
        int postindex = 0 , nagativeIndex = 1;
        for(int i : arr){
            if(i > 0){
                newArray[postindex] = i;
                postindex = postindex + 2;
            }else {
                newArray[nagativeIndex] = i;
                nagativeIndex = nagativeIndex + 2;
            }
        }
        System.out.println(Arrays.toString(newArray));

//        int[] newArry1 = new int[arr.length / 2];
//        int[] newArry2 = new int[arr.length / 2];
//        int count1 = 0;
//        int count2 = 0;
//        for (int j : arr) {
//            if (j > 0) {
//                newArry1[count1++] = j;
//            } else {
//                newArry2[count2++] = j;
//            }
//        }
//        for (int i = 0; i < arr.length / 2; i++) {
//                arr[2 * i] = newArry1[i];
//                arr[2 * i + 1] = newArry2[i];
//
//        }
//        System.out.println(Arrays.toString(newArry2));
//        System.out.println(Arrays.toString(newArry1));
//        System.out.println(Arrays.toString(arr));
//

    }
}
