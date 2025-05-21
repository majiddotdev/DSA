package StringDSA;

import java.util.HashMap;
import java.util.Map;

public class CountString {
    public static void main(String[] args) {
        String str = "w4a3d1e1x6";
        Map<Character, Integer> map = new HashMap<>();
        int i = 0, j = 1;
        while (j <= str.length()) {
            map.put(str.charAt(i), Integer.parseInt(String.valueOf(str.charAt(j))));
            i = i + 2;
            j = j + 2;
        }
        map.forEach((key, value) ->
                {
                    for (int k = 0; k < value; k++) {
                        System.out.print(key);

                    }
                }
        );
    }
}
