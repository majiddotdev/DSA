package ArraysDSA;

public class findLowerBoundInAnArray {
    public static void main(String[] args) {
        int[] arr = {2, 2, 6, 8, 8, 8, 11, 13};
        int target = 8;
        int left = 0 , right = arr.length - 1;
        while (left < right){
            int mid = left + (right -left) / 2;
            if (arr[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(left);
    }
}
