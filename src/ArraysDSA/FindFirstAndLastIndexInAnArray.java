package ArraysDSA;

public class FindFirstAndLastIndexInAnArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 8, 8, 11, 13};
        int k = 8;
        int firstIndex = -1, lastIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                if (firstIndex == -1) {
                    firstIndex = i;
                }
                lastIndex = i;
            }
        }

        System.out.println("First Index: " + firstIndex);
        System.out.println("Last Index: " + lastIndex);
    }
}
