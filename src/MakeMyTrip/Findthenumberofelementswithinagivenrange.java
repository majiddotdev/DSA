package MakeMyTrip;

public class Findthenumberofelementswithinagivenrange {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 8, 10, 12, 14, 16};
        int l = 5, r = 12;
        int count = 0;
        for (int j : arr) {
            if (j > l && j < r) {
                count++;
            }
        }
        System.out.println(count);

    }
}
