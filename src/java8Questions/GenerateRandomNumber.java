package java8Questions;

import java.util.Random;
import java.util.stream.Stream;

public class GenerateRandomNumber {
    public static void main(String[] args) {

        Random random = new Random();
        Stream.generate(() -> {
            int number = random.nextInt(50);
            return "Data-" + number;
        }).limit(5).forEach(System.out::println);


    }
}
