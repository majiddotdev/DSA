import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveTheDuplicateAndSortString {
    public static void main(String[] args) {
        String str = "majidsaba";
        String str1 = checkString(str);
        System.out.println(str1);
    }

    private static String checkString(String str) {
        return Arrays.stream(str.split(""))
                .distinct()
                .sorted()
                .collect(Collectors.joining(""));
    }
}
