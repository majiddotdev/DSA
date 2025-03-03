package ArraysDSA.Top10StringNokiaInterviewQuestions;

public interface ReverseAString {
    public static void main(String[] args) {
        String str = "majidsaba";
        StringBuilder stringBuffer = new StringBuilder(str);
        stringBuffer.reverse();
        System.out.println(stringBuffer);
    }
}
