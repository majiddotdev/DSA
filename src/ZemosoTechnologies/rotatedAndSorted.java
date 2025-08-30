package ZemosoTechnologies;

public class rotatedAndSorted {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 1, 2};
        System.out.println(check(arr));
    }

    public static boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }

        return count <= 1;
    }
}


