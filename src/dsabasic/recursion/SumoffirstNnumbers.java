package dsabasic.recursion;

public class SumoffirstNnumbers {
    public static void main(String[] args) {
        int n = 10;
        int sum1 = SumoffirstNnumber(n );
        System.out.println(sum1);
    }

    private static int SumoffirstNnumber(int n) {
        if(n == 1) return n;
        return n + SumoffirstNnumber(n - 1);

    }
}
