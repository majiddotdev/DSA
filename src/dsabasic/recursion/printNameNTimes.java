package dsabasic.recursion;

public class printNameTimes {
    public static void main(String[] args) {
        int n = 15, i = 0;
        printNameTime(n, i);
    }

    private static void printNameTime(int n, int i) {
        if (i > n) return;
        System.out.println("in the name of ALLAH");
        printNameTime(n, i + 1);
    }
}
