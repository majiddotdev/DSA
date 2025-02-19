import java.util.Arrays;
import java.util.stream.Collectors;

public class CaptilizeAtParticularIndex {
    public static void main(String[] args) {
        String str = "hi majid how are you";
        int index = 2;
        String result = Arrays.stream(str.split(" "))
                .map(e->e.substring(0 , 1).concat(String.valueOf(Character.toUpperCase(e.charAt(1)))).concat(e.substring(2)))
                .collect(Collectors.joining(" "));
        System.out.println(result);
    }
}
