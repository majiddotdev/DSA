package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class ReverseAStringUsingJava8Streams {
    public static void main(String[] args) {
        String str = "majidfayaz";
        String k = Arrays.stream(str.split(" ")).map(e->{
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(e);
            return stringBuilder.reverse().toString();
        }).collect(Collectors.joining(" "));
        System.out.println(k);

//
//        import java.util.stream.Collectors;
//import java.util.stream.IntStream;
//
//        public class ReverseStringJava8 {
//            public static void main(String[] args) {
//                String str = "majidfayaz";
//
//                String reversed = IntStream.range(0, str.length()) // 🔹 Iterate over character indexes
//                        .mapToObj(i -> str.charAt(str.length() - 1 - i))  // 🔹 Reverse index order
//                        .map(String::valueOf) // 🔹 Convert char to String
//                        .collect(Collectors.joining()); // 🔹 Join characters back
//
//                System.out.println(reversed); // Output: zayafidjam
//            }
//        }


    }
}
