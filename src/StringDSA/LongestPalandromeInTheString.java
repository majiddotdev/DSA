package StringDSA;

public class LongestPalandromeInTheString {
    public static void main(String[] args) {
        String str = "babad";
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String newString = str.substring(i, j);
                boolean check = checkPalindrome1(newString);
                if (str1.length() <= newString.length() && newString.length() > 1 && check) {
                    str1 = newString;
                    System.out.println(str1);

                }
            }
        }
    }

    private static boolean checkPalindrome1(String newString) {
        int left = 0, right = newString.length() - 1;
        while (left < right) {
            if (newString.charAt(left) == newString.charAt(right)) {
                right--;
                left++;
            } else {
                return false;
            }
        }

        return true;
    }
}
