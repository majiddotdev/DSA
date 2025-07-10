package dsabasic;

public class CheckForPrime {
    public static void main(String[] args) {
        int number = 17;
        System.out.println(checkForPrimeNumber(number));
    }

    private static boolean checkForPrimeNumber(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
