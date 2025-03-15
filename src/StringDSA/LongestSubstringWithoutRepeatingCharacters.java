package StringDSA;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String str = "pwwkew";
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length() + 1; j++) {
                String new1 = str.substring(i, j);
                boolean check = checkUniqueness(new1);
                if (check) {
                    if (new1.length() > newStr.length()) {
                        newStr = str.substring(i, j);
                    }
                }
            }
        }
        System.out.println(newStr.length());
    }

    private static boolean checkUniqueness(String substring) {
        for (int i = 0; i < substring.length(); i++) {
            for (int j = i + 1; j < substring.length() ; j++) {
                if (substring.charAt(i) == substring.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
