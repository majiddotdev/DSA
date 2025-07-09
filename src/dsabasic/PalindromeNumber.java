package dsabasic;

public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 121;
        int orginalnumber = number;
        if(number < 0) System.out.println(false);
        int reverse = 0;
        while (number > 0){
            int remainder = number % 10;
            number = number / 10;
            reverse = (reverse * 10) + remainder;
        }
        if(orginalnumber == reverse){
            System.out.println(true);
        }else {
            System.out.println(false);
        }


    }
}
