package ArraysDSA;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0, 6};
        findLeaders(arr);
    }

    public static void findLeaders(int[] arr) {
        int n = arr.length;
        int maxFromRight = arr[n - 1];
//        System.out.print(maxFromRight + " ");

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                System.out.print(maxFromRight + " ");
            }
        }
    }
}
