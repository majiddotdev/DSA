package java8;

import java.util.Comparator;
import java.util.List;

public class SortthelistofstudentsusingJavaStreamsandComparator {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Alice", 20, 85.5),
                new Student("Bob", 22, 91.2),
                new Student("Charlie", 20, 91.2),
                new Student("Charlie", 19, 78.9),
                new Student("Eve", 22, 85.5)
        );
        students.stream().sorted(Comparator.comparing(Student::getName)
                .thenComparingInt(Student::getAge).thenComparingDouble(Student::getGrade)).forEach(e-> System.out.println(e));

    }
}
