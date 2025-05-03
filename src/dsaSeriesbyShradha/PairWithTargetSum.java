package dsaSeriesbyShradha;

public class PairWithTargetSum {
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int target = 6;
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (arr[left] + arr[right] == target) {
                System.out.println(left + " " + right);
                return;
            } else if (arr[left] + arr[right] > target) {
                left ++;
            } else {
                right--;
            }
        }
    }
}
