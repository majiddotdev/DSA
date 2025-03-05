public class CheckPowerOfNumber {
    public static void main(String[] args) {
        int number = 8;
        System.out.println(checkNumber(number));
    }

    public static boolean checkNumber(int number) {
        int count = 0, sum = number;
        if (number % 2 != 0) {
            return false;
        } else {
            while (number > 1) {
                number = number / 2;
                count++;
            }
            int k = (int) Math.pow(2, count);
            return k == sum;

        }
    }
}
