import java.util.Arrays;

public class CaptilizeAtParticularIndex {
    public static void main(String[] args) {
        String str = "hi majid how are               you                                          ";

        Arrays.stream(str.trim().toLowerCase().split("\\s+")).map(e->{
            StringBuilder stringBuilder = new StringBuilder();
            for(int i = 0 ; i< e.length() ; i++){
                if(i % 2 == 0){
                    stringBuilder.append(Character.toUpperCase(e.charAt(i)));
                }else {
                    stringBuilder.append(Character.toLowerCase(e.charAt(i)));

                }
            }
            return stringBuilder.toString();

        }).forEach(System.out::println);



//        int index = 2;
//        String result = Arrays.stream(str.split(" "))
//                .map(e->e.substring(0 , 1).concat(String.valueOf(Character.toUpperCase(e.charAt(1)))).concat(e.substring(2)))
//                .collect(Collectors.joining(" "));
//        System.out.println(result);
    }
}
