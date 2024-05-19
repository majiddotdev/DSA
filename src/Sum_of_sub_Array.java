public class Sum_of_sub_Array {
    public static void main(String[] args) {
        int arr[] = { 1 , -2  , 6 , -1 , 3};
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i ; j < arr.length ; j++){
                int sum = 0;
                for( int k = i ; k <= j ; k++){
                    sum = sum + arr[k];
                }
                System.out.println(sum + "");
            }
            System.out.println();

        }
    }
}
