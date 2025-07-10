package dsabasic.recursion;

public class Print1toNUsingRecursion {
    public static void main(String[] args) {
        int n = 15;
        int i = 1;
        Print1toNRecursion(n , i);

    }

    private static void Print1toNRecursion(int n, int i) {
        if(i > n) return;
        System.out.println(i);
        Print1toNRecursion(n , i +1);
    }
}
