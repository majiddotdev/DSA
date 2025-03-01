import java.util.Arrays;
import java.util.stream.Collectors;

public class CapitalFirstLetter {
    public static void main(String[] args) {
        String str = "cOmpAny NamE is wealthMax finAnCial aDvIce";
        System.out.println(getFirstCapitalLetter(str));
    }
    public static Object getFirstCapitalLetter(String str){
        return Arrays.stream(str.split(" "))
                .map(e -> Character.toUpperCase(e.charAt(0)) + e.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));



//        String[] str1 = str.split(" ");
//        StringBuilder sb = new StringBuilder();
//
//        for(String s : str1) {
//           sb.append(Character.toUpperCase(s.charAt(0)))
//                   .append(s.substring(1).toLowerCase())
//                   .append(" ");
//        }
//        return sb.toString();

    }
}


