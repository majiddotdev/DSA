package ArraysDSA.Top10NokiaInterviewQuestions;

public class FindtheFirstandLastPositionofanElementinaSortedArray {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int n = 8 , firstPosition = -1 , lastPosition= -1;
        for (int i = 0 ; i < arr.length ; i++){
            if(arr[i] == n){
                if(firstPosition == -1){
                    firstPosition = i;
                }
                lastPosition = i;
            }
        }
        System.out.println("firstPosition   " + firstPosition);
        System.out.println("lastPosition   " + lastPosition);


    }
}
