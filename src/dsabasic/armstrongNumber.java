package dsabasic;

public class armstrongNumber {
    public static void main(String[] args) {
        int number = 153;
        System.out.println(checkArmstrongNumber(number));
    }

    private static boolean checkArmstrongNumber(int number) {
        if (number < 9) return false;
        int sum = 0, orginal = number;
        int length = String.valueOf(number).length();
        while (number > 0) {
            int remainder = number % 10;
            sum = (int) (sum + Math.pow(remainder, length));
            number = number / 10;
        }
        return sum == orginal;
    }


}
