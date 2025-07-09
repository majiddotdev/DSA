package java8;

import java.util.stream.Stream;

public class Genertae10RandomIntgerUsingStream {
    public static void main(String[] args) {
        Stream.generate(()-> (int) (Math.random() * 5)).limit(5).forEach(System.out::println);
    }
}
