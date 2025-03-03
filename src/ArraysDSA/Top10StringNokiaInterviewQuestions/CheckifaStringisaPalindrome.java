package ArraysDSA.Top10StringNokiaInterviewQuestions;

public class CheckifaStringisaPalindrome {
    public static void main(String[] args) {
        String str = "madam";
        System.out.println(checkThePalindrome(str));
    }

    private static Boolean checkThePalindrome(String str) {
        String newStr = "";
        StringBuilder stringBuffer = new StringBuilder(str);
        return str.contentEquals(stringBuffer.reverse());
    }
}
