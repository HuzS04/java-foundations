package week2;

public class Main {
    public static void main(String[] args){
        int[] grades1 = {23, 46, 43, 57, 97};
        int[] grades2 = {46, 12, 67, 32, 68};
        int[] grades3 = {38, 94, 27, 47, 35};
        Student student1 = new Student("Bob", 21, grades1);
        Student student2 = new Student("John", 20, grades2);
        Student student3 = new Student("Mike", 22, grades3);

        Student[] students = {student1, student2, student3};
        GradeBook gradeBook = new GradeBook(students);

        gradeBook.printAllReports();

        Student top = gradeBook.getTopStudent();
        System.out.println("Top student: " + top.name + " with average " + top.calculateAverage());
    }
}
