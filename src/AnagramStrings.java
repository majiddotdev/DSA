import java.util.Arrays;
import java.util.stream.Collectors;

public class AnagramStrings {
    public static void main(String[] args) {
        String str1 = "saba";
        String str2 = "abas";
        Boolean check = checkAnagram(str1, str2);
        System.out.println(check);
    }

    private static Boolean checkAnagram(String str1, String str2) {
        return Arrays.stream(str1.toLowerCase().split("")).sorted().collect(Collectors.joining(""))
                .equals(Arrays.stream(str2.toLowerCase().split("")).sorted().collect(Collectors.joining("")));
    }
}
