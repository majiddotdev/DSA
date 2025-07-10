package dsabasic.recursion;

public class PrintNto1usingrecursion {
    public static void main(String[] args) {
        int n = 15;
        int i = 1;
        printNto1(n, i);
    }

    private static void printNto1(int n, int i) {
        if(n < i) return; ;
        System.out.println(n);
        printNto1(n -1 , i);
    }
}
