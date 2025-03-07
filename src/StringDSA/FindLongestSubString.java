package StringDSA;

public class FindLongestSubString {
    public static void main(String[] args) {
        String[] arr = {"flow", "flower", "fly"};
        String prefix = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix = compareStrings(prefix, arr[i]);
            if (prefix.isEmpty()) {
                break;
            }
        }

        System.out.println("Longest common prefix: " + prefix);
    }

    private static String compareStrings(String s, String s1) {
        StringBuilder str = new StringBuilder();
        int minLength = Math.min(s.length(), s1.length());

        for (int i = 0; i < minLength; i++) {
            if (s.charAt(i) == s1.charAt(i)) {
                str.append(s.charAt(i));
            } else {
                break;
            }
        }

        return str.toString();
    }
}
