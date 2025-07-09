package dsabasic;

public class ReverseANumber {
    public static void main(String[] args) {
        int number = 1;
//        int k = (number % 10) * 10 + (number / 10);
//        System.out.println(k);

        int reverse = 0;
        if(number <= 9) System.out.println("we can not reverse the number");
        while(number > 0){
            int reminder = number % 10;
            number = number / 10;
            reverse = reverse * 10  +  reminder;
        }
        System.out.println(reverse);


    }
}
