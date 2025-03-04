package ArraysDSA.Top10StringNokiaInterviewQuestions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CheckIfTwoStringsAreAnagrams {
    public static void main(String[] args) {
        String str1 = "listen", str2 = "silent";
        System.out.println(checkAnagrams(str1, str2));

    }

    private static boolean checkAnagrams(String str1, String str2) {
        return Arrays.stream(str1.split("")).sorted().collect(Collectors.joining("")).equals(Arrays.stream(str2.split("")).sorted().collect(Collectors.joining("")));
    }
}


//import java.util.Arrays;
//
//public class CheckIfTwoStringsAreAnagrams {
//    public static void main(String[] args) {
//        String str1 = "listen", str2 = "silent";
//        System.out.println(areAnagrams(str1, str2));
//    }
//
//    private static boolean areAnagrams(String str1, String str2) {
//        if (str1.length() != str2.length()) return false;
//
//        char[] charArray1 = str1.toCharArray();
//        char[] charArray2 = str2.toCharArray();
//
//        Arrays.sort(charArray1);
//        Arrays.sort(charArray2);
//
//        return Arrays.equals(charArray1, charArray2);
//    }
//}
