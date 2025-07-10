package dsabasic.recursion;

public class PrintFibonacciSeries {
    public static void main(String[] args) {
        int n = 5;
        int a = 0;
        int b = 1;
        System.out.println(a);
        printFibonacci(a, b, n);
    }

    private static void printFibonacci(int a, int b, int n) {
        if (n == 0) return;
        System.out.println(b);
        printFibonacci(b, a + b, n - 1);
    }


}
