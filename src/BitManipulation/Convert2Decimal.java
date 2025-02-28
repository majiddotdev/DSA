package BitManipulation;

public class Convert2Decimal {
    public static void main(String[] args) {
        String str = "1101";
        int v = 0;
        int count = 0;
        for(int i = str.length() - 1 ; i >= 0 ; i--){
            int bit = str.charAt(i) - '0';
             v = (int) (v + (bit * Math.pow(2, count)));
             count ++;
        }
        System.out.println(v);
    }
}
