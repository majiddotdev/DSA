package dsabasic.recursion;

public class Checkifastringispalindromeornot {
    public static void main(String[] args) {
        String str = "madam";
        System.out.println(checkStringPalindrome(0, str, str.length()));
    }

    private static boolean checkStringPalindrome(int i, String str, int n) {
        if (i >= n / 2) return true;
        if (str.charAt(i) != str.charAt(n - 1 - i)) {
            return false;
        }
        return checkStringPalindrome(i + 1, str, n);
    }


}
