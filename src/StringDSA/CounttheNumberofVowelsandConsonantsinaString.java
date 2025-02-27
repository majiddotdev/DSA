package StringDSA;

public class CounttheNumberofVowelsandConsonantsinaString {
    public static void main(String[] args) {
        String str = "sabamajid";
        int n = str.split("").length;
        int vowel = 0, consonant = 0;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == 'a'
                    || str.charAt(i) == 'e'
                    || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u'){
                vowel ++;
            }else {
                consonant++;
            };
        }

        long vowels = str.chars()
                .filter(ch -> "aeiou".indexOf(ch) != -1)
                .count();
        System.out.println(vowels);
        System.out.println(vowel  + " vowel");
        System.out.println(consonant + " consonant");
    }
}
