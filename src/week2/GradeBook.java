package week2;

import java.io.FileWriter;
import java.io.IOException;

public class GradeBook {
    Student[] students;

    public GradeBook(Student[] students){

        this.students = students;
    }

    public void printAllReports(){
        for(Student student : students){
            student.printReport();
        }
    }

    public Student getTopStudent(){
        Student highestGrade = students[0];
        for(Student student : students){
            if(student.calculateAverage() > highestGrade.calculateAverage()){
                highestGrade = student;
            }
        }
        return highestGrade;
    }

    public void saveAllReports(){
        try(FileWriter writer = new FileWriter("all_reports.txt")){
            for(Student student : students){
                String line = student.getName() + " - " + student.getRole() + " - " + student.calculateAverage() + "\n";
                writer.write(line);
            }
        } catch (IOException e) {
            System.out.println("Something went wrong with writing this file: " + e.getMessage());
        }
    }
}
