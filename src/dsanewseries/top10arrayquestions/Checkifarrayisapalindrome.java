package dsanewseries.top10arrayquestions;

public class Checkifarrayisapalindrome {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};
        int left = 0, right = arr.length - 1;
        boolean flag = true;
        while (left < right){
           if(arr[left] != arr[right]){
               flag = false;
               break;
           }
            left ++;
            right --;
        }
        System.out.println(flag);
    }
}
