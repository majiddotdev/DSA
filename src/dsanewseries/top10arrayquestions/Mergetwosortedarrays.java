package dsanewseries.top10arrayquestions;

public class Mergetwosortedarrays {
    public static void main(String[] args) {
        int [][]arr ={{1 , 2 , 3} ,
                       {4 , 5 , 6} ,
                       {7 , 8 , 9}};

        for(int i = 2 ; i >= 0 ; i --){
            for(int j = 0 ; j <=2 ; j ++){
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }



    }
}
