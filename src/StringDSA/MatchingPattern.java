package StringDSA;

public class MatchingPattern {
    public static void main(String[] args) {
        String str1 = "abcdabcabcdef";
        String str2 = "abcdef";
        int index = checkMatchingString(str1, str2);
        System.out.println(index);
    }

    private static int checkMatchingString(String str1, String str2) {
        int index = 0, count = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == str2.charAt(index)) {
                if (count == 0) {
                    count = i;
                }
                index++;
                if (index == str2.length()) {
                    return count;
                }
            } else {
                count = 0;
            }
        }
        return -1;

    }
}
