package week3;
import week2.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 7, 2, 9, 4, 1, 8, 5, 6, 10);

        List<Student> students = new ArrayList<>();
        Student student1 = new Student("Bob", 21, new int[]{12, 32, 82, 17});
        Student student2 = new Student("Jack", 22, new int[]{23, 41, 52, 73});
        Student student3 = new Student("Steve", 23, new int[]{56, 86, 43, 17});
        students.add(student1);
        students.add(student2);
        students.add(student3);

        List<Integer> larger = numbers.stream()
                .filter(n -> n > 5)
                .collect(Collectors.toList());
        System.out.println(larger);

        List<Integer> squared = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(squared);

        List<String> names = students.stream()
                .map(student -> student.getName())
                .collect(Collectors.toList());
        System.out.println(names);

        List<Student> passing = students.stream()
                .filter(student -> student.calculateAverage() > 50)
                .collect(Collectors.toList());
        passing.forEach(student -> System.out.println(student.getName()));
    }
}
