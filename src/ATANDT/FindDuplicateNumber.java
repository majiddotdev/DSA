package ATANDT;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {3, 1, 3, 4, 2};
        System.out.println(findDuplicate(arr));
    }

    private static int findDuplicate(int[] arr) {
        int length = arr.length;
        if (length == 0 || length == 1)

            return -1;
        return length;
    }


//    private static int findDuplicate(int[] arr) {
//        int length = arr.length;
//        if (length == 0 || length == 1) {
//            return -1;
//        }
//        for (int i = 0; i < length; i++) {
//            for (int j = i + 1; j < length; j++) {
//                if (arr[i] == arr[j]) {
//                    return arr[i];
//                }
//            }
//        }
//
//        return -1;
//    }
}
