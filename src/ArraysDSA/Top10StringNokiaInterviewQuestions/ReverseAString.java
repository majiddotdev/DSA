package ArraysDSA.Top10StringNokiaInterviewQuestions;

public class ReverseAString {
    public static void main(String[] args) {
        String str = "majidsaba" , str1 = "";
//        StringBuilder stringBuffer = new StringBuilder(str);
//        stringBuffer.reverse();
//        System.out.println(stringBuffer);
        for(int i = str.length() -1 ; i >= 0 ; i--){
            str1 += str.charAt(i);
        }

        System.out.println(str1);

    }
}
