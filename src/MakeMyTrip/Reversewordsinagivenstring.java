package MakeMyTrip;

public class Reversewordsinagivenstring {
    public static void main(String[] args) {
        String str = "I like this program very much";
        String[] strs = str.trim().split(" ");
        int left = 0, right = strs.length - 1;
        while (left < right) {
            String temp = strs[left];
            strs[left] = strs[right];
            strs[right] = temp;
            left++;
            right--;
        }
    }
}

//        Arrays.stream(str.trim().split(" ")).sorted(Collections.reverseOrder()).forEach(e-> System.out.print(e + " "));

