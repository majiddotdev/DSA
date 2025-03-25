public class Number {
    public static void main(String[] args) {
        int number = 12;
        number = ( number % 10 ) * 10 + number / 10;
        System.out.println(number);
    }
}
