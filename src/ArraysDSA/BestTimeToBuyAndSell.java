package ArraysDSA;

// bhjbsbaj
public class BestTimeToBuyAndSell {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        int profit = 0;
        int min_cost = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int cost = arr[i] - min_cost;
            profit = Math.max(profit,cost );
            min_cost = Math.min(min_cost, arr[i]);
        }

        System.out.println(profit);
        System.out.println(min_cost);
    }
}
