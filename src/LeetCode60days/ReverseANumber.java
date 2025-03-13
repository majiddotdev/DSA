package LeetCode60days;

public class ReverseANumber {
    public static void main(String[] args) {
        int x = 123;
        int k = reverse1(-123);
        System.out.println(k);
    }

    private static int reverse1(int x) {

        int x1 = 0;
        while (x != 0){
            int r1 = x % 10;
            x = x / 10;
            x1 = r1 + (x1 * 10);
        }
        return x1;
    }
}
