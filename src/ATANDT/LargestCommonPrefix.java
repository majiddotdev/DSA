package ATANDT;

public class LargestCommonPrefix {
    public static void main(String[] args) {
        String[] list = {"fant", "fantter", "fan"};

        String prefix = list[0];

        for (String s : list) {
            while (!s.startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        if (prefix.isEmpty()) {
            prefix = "";
        }
        System.out.println(STR."===============\{prefix}");

    }
}
