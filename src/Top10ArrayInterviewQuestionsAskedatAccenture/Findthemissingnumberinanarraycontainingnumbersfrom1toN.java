package Top10ArrayInterviewQuestionsAskedatAccenture;

public class Findthemissingnumberinanarraycontainingnumbersfrom1toN {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int n = 6;
        int output = findMissingNumberXOR(arr, n);
        System.out.println(output);
    }

    private static int findMissingNumberXOR(int[] arr, int n) {
        int xor1 = 0, xor2 = 0;
        for (int j : arr) {
            xor1 ^= j;
        }
        for (int i = 1; i <= n; i++) {
            xor2 ^= i;
        }
        return xor1 ^ xor2;
    }

}
