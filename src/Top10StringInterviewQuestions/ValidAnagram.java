package Top10StringInterviewQuestions;


public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(validAnagram("anagram", "nagaram"));
    }

    private static Boolean validAnagram(String st1, String st2) {
        if (st1.length() != st2.length()) {
            return false;
        }

        int[] arr = new int[26];
        for (int i = 0; i < st1.length(); i++) {
            arr[st1.charAt(i) - 'a']++;
            arr[st2.charAt(i) - 'a']--;
        }
        for (int c : arr) {
            if (c != 0)
                return false;
        }
        return true;


    }
}
