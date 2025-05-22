public class MergeStringsAlternately {
    public static void main(String[] args) {
        String str1 = "abc" , str2 = "def44444";
        StringBuilder stringBuilder = new StringBuilder();
        int length = Math.max(str1.length() , str2.length());
        for(int i = 0 ; i < length ; i++){
            if(i < str1.length()) stringBuilder.append(str1.charAt(i));
            if(i < str2.length()) stringBuilder.append(str2.charAt(i));
        }

        System.out.println(stringBuilder.toString());

    }
}
