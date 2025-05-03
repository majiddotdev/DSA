package dsaSeriesbyShradha;

public class PairWithTargetSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        int target = 6;
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (arr[left] + arr[right] == target) {
                System.out.println(left + " " + right);
                return;
            } else if (arr[left] + arr[right] > target) {
                right--;
            } else {
                left++;
            }
        }
    }
}
