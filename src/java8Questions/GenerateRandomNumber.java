package java8Questions;

import java.util.Random;
import java.util.stream.Stream;

public class GenerateRandomNumber {
    public static void main(String[] args) {

        Random random = new Random();
        Stream<String> testData = Stream.generate(() -> {
            int number = random.nextInt(50) ;
            return "Data-" + number;
        });
        testData.limit(5).forEach(System.out::println);



    }
}
