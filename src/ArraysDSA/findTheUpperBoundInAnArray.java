package ArraysDSA;

public class findTheUpperBoundInAnArray {

        public static void main(String[] args) {
            int[] arr = {2, 2, 6, 8, 8, 8, 11, 13};
            int target = 8;
            int left = 0 , right = arr.length - 1;
            while (left < right){
                int mid = left + (right -left) / 2;
                if (arr[mid] <= target) {
                    left = mid;
                } else {
                    right = mid - 1;
                }
            }
            System.out.println(left);
        }


}
