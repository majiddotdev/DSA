package BitManipulation;

public class Convert2Binary {
    public static void main(String[] args) {
        int number = 13;
        StringBuilder newNumber = new StringBuilder();
        while (number > 0){
           if(number % 2 == 1) newNumber.append(1);
           else  newNumber.append(0);
           number = number / 2;
        }
        System.out.println(newNumber.reverse());
    }
}
