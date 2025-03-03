package BitManipulation;

public class CheckIfTheIthBitIsSetOrNot {
    public static void main(String[] args) {
        int number = 13;
        int i = 2;
        Boolean b = checkIfTheIthBitIsSetOrNot(number, i);
        System.out.println(b);

    }

    private static Boolean checkIfTheIthBitIsSetOrNot(int number, int i) {
        StringBuilder stringBuilder = new StringBuilder();
        while (number > 0) {
            if (number % 2 == 1) stringBuilder.append("1");
            else {
                stringBuilder.append("0");
            }
            number = number / 2;
        }
        System.out.println(stringBuilder);
        char c = stringBuilder.charAt(i);

        if (c - '0' == 0) {
            return false;
        }
        return true;
    }
}


//package BitManipulation;
//
//public class CheckIfTheIthBitIsSetOrNot {
//    public static void main(String[] args) {
//        int number = 13; // Binary: 1101
//        int i = 3; // Check the 3rd bit (0-indexed)
//        boolean result = checkIfTheIthBitIsSetOrNot(number, i);
//        System.out.println(result); // Output: true (since the 3rd bit is 1)
//    }
//
//    private static boolean checkIfTheIthBitIsSetOrNot(int number, int i) {
//        // Shift the number to the right by 'i' bits and check the least significant bit
//        return (number & (1 << i)) != 0;
//    }
//}
