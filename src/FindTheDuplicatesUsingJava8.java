import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FindTheDuplicatesUsingJava8 {
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 4 , 7 , 1 , 6 , 4 , 9 , 10};
        Map<Integer, Long> map;
        map = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(e -> e , Collectors.counting()));
        map.entrySet().stream().filter(e->e.getValue() > 1).forEach(e-> System.out.println(e.getKey()));
    }
}
