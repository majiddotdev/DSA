import java.util.ArrayList;
import java.util.List;

public class GreatestCommonDivisorOfStrings {
    public static void main(String[] args) {
        String str1 = "ABCABC", str2 = "CABA";
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        String newStr = "";
        for(int i = 0 ; i < str1.length() ; i++){
            for(int j = i +1 ; j <= str1.length() ; j++){
                list1.add(str1.substring(i , j));
            }
        }
        for(int i = 0 ; i < str2.length() ; i++){
            for(int j = i +1 ; j <= str2.length() ; j++){
                list2.add(str2.substring(i , j));
            }
        }

        for(int i = 0 ; i < Math.max(list1.size() , list2.size()) ; i++){
            for(int j = 0 ; j < Math.min(list1.size() , list2.size()) ; j++){
                if(list1.get(i).equals(list2.get(j))){
                    if(newStr.length() < list1.get(i).length()){
                        newStr = list1.get(i);
                    }
                }
            }
        }

        System.out.println(newStr);




    }
}
