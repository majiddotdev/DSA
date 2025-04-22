package dsanewseries.top10arrayquestions;

public class Findthemissingnumberfrom1ton {
    public static void main(String[] args) {
         int[] arr = {1, 2, 4, 5, 6};
        int n= 6 , sum = n * ( n + 1) / 2;;
        for(int i : arr){
            sum -= i;
        }
        System.out.println(sum );

    }
}
