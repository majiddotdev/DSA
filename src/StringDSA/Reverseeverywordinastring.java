package StringDSA;


public class Reverseeverywordinastring {
    public static void main(String[] args) {
        String str = "welcome to the jungle   ";
        String ch[] = str.split("\\s+");
       int left = 0 , right = ch.length - 1;
       while (left < right){
           String temp = ch[left];
           ch[left++] = ch[right];
           ch[right--] = temp;
       }
        System.out.println(String.join(" " , ch));


    }
}
