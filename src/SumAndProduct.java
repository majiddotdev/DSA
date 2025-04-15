public class SumAndProduct {
    public static void main(String[] args) {
        int num[] = {4, 5, 6, 8, 9, 7};
        int product = 1, sum = 0;
        for (var i : num) {
            product = product * i;
        }
        System.out.println(product);

        while (product > 0) {
            sum += product % 10;
            product = product / 10;
        }
        System.out.println(sum);
    }
}
