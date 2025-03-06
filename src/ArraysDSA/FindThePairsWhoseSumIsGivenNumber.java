package ArraysDSA;

public class FindThePairsWhoseSumIsGivenNumber {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 9, 15, 2, 8, 3, 4, 11};
        int sum = 17;
        for(int i = 0 ; i < arr.length ; i ++){
            for(int j = i +1 ; j < arr.length ; j++){
                if(arr[i] + arr[j] == sum){
                    System.out.print("{" + arr[i]  + " " + arr[j] + "}");
                }
            }
        }
    }
}
