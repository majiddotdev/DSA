package dsabasic.recursion;

public class SumoffirstNnumbers {
    public static void main(String[] args) {
        int n = 10;
        int sum1 = SumoffirstNnumber(n );
        System.out.println(sum1);
    }

    private static int SumoffirstNnumber(int n) {
        if(n == 0) return 0;
        return n + SumoffirstNnumber(n - 1);

    }
}
