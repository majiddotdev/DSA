package TwoPointer;

public class ReverseVowelsOfAString {
    public static void main(String[] args) {
        String str = "sabamaaaAAZAAAAjid";
        StringBuilder sb = new StringBuilder(str);
        int left = 0, right = str.length() - 1;
        while (left < right){
            if(isVowel(sb.charAt(left) ) && isVowel(sb.charAt(right))){
                char temp = sb.charAt(left);
                sb.setCharAt(left , sb.charAt(right));
                sb.setCharAt(right , temp);
                left++;
                right--;
            }
            if(!isVowel(sb.charAt(left))) left++;
            if(!isVowel(sb.charAt(right))) right--;
        }
        System.out.println(sb.toString());


    }

    public static Boolean isVowel(char c1){
        char c = Character.toLowerCase(c1);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
