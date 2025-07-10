package dsabasic.numbers;

import java.util.ArrayList;
import java.util.List;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
                int n1 = 6, n2 = 4;
                int maxNumber = 0;
                List<Integer> list1 = getDivisors(n1);
                List<Integer> list2 = getDivisors(n2);
                for(int i = 0 ; i < list1.size() ; i++){
                    for(int j = 0 ; j < list2.size() ; j++){
                        if (list1.get(i) == list2.get(j)){
                            if(maxNumber < list1.get(i)){
                                maxNumber = list1.get(i);
                            }
                        }
                    }
                }
                System.out.println(maxNumber);


            }

            private static List<Integer> getDivisors(int n1) {
                List<Integer> list = new ArrayList<>();
                for (int i = 1; i <= n1; i++) {
                    if (n1 % i == 0) list.add(i);
                }
                return list;

            }
        }