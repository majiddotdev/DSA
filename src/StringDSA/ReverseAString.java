package StringDSA;

public class ReverseAString {
    public static void main(String[] args) {
        String str = "majidsaba";
        String str1 = new StringBuilder(str).reverse().toString();
        System.out.println(str1);
    }
}
