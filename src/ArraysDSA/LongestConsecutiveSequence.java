package ArraysDSA;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {102 , 4 , 100 , 1 , 101 , 3 , 2 , 1};
        int pointer = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            int count = 0;
            int number = arr[i];
            int  k = 0;
            while(k < arr.length){
                number = number + 1;
                if(number  == arr[k]){
                    count++;
                }
                k++;
            }
            System.out.println(count);
        }
    }
}
