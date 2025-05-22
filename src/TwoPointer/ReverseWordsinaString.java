package TwoPointer;

public class ReverseWordsinaString {
    public static void main(String[] args) {
        String str = "hello world";
        String[] ch = str.trim().split("\\s+");
        int left = 0 , right = ch.length -1;
        while (left < right){
            String temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left ++;
            right --;
        }
        System.out.println(String.join(" ", ch));
    }
}
