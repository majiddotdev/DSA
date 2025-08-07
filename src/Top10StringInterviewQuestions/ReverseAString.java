package Top10StringInterviewQuestions;


public class ReverseAString {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(reverseStr(str));
        System.out.println( reverseStr1(str));


    }

    private static String reverseStr1(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }

    private static String reverseStr(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
