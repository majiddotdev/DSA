package StringDSA;

public class CheckIfAStringIsAPalindrome {
    public static void main(String[] args) {
        String str = "madam";
        boolean status = checkPalindrome(str);
        System.out.println(status);
    }

    private static boolean checkPalindrome(String str) {
        int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
