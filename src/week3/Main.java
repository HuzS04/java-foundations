package week3;

import week2.GradeBook;
import week2.Student;

public class Main {
    public static void main(String[] args){
        Student student1 = new Student("Bob", 21, new int[]{12, 43, 64, 23, 65});
        Student student2 = new Student("Dave", 23, new int[]{32, 63, 12, 76, 40});
        Student student3 = new Student("Jon", 22, new int[]{42, 67, 32, 58, 97});

        Student[] students = {student1, student2, student3};

        GradeBook gradeBook = new GradeBook(students);

        FilePractice.saveStudentReport(student1);

        FilePractice.readReport();

        gradeBook.saveAllReports();
    }
}
