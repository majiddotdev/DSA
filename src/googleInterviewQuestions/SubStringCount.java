package googleInterviewQuestions;

public class SubStringCount {
    public static void main(String[] args) {
        String str = "abcde";
        String[] strs = {"a" , "bb" , "ace" , "ade"};



//        {a , ab , abc , ac , b , bc , c}
       String[] str1 = getStrings(str);
    }

    private static String[] getStrings(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length() + 1; j++) {
                System.out.println(str.substring(i, j));
            }
        }
        return new String[0];
    }

}
