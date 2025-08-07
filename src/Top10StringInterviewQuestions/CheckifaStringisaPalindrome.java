package Top10StringInterviewQuestions;

public class CheckifaStringisaPalindrome {
    public static void main(String[] args) {
        System.out.println(Palindrome1("madam"));
        System.out.println(Palindrome2("mad1am"));


    }

    private static boolean Palindrome2(String str) {
        StringBuilder sb = new StringBuilder(str);
        return str.equals(sb.reverse().toString());
    }

    private static Boolean Palindrome1(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
