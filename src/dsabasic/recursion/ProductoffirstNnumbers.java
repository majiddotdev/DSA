package dsabasic.recursion;

public class ProductoffirstNnumbers {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(product(n));
    }

    private static int product(int n) {
        if (n == 1) return n;
        return n * product(n - 1);
    }
}
