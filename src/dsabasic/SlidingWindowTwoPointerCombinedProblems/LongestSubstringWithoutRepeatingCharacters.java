package dsabasic.SlidingWindowTwoPointerCombinedProblems;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String str = "aaabbbccc";
        int longest = longestSubtring(str);
        System.out.println(longest);
    }

    private static int longestSubtring(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                String subStr = str.substring(i, j);
                if (subStr.length() > s.length()) {
                    if (validate1(subStr)){
                        s = subStr;

                    }
                }
            }

        }

        return s.length();
    }

    private static boolean validate1(String subStr) {
        for (int i = 0; i < subStr.length(); i++) {
            for (int j = i + 1; j < subStr.length(); j++) {
                if (subStr.charAt(i) == subStr.charAt(j)) {
                    return false;
                }
            }
}
            return true;
        }
    }
