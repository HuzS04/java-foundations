package week3;

import week2.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FilePractice {
    public static void saveStudentReport(Student student){
        try (FileWriter writer = new FileWriter("student_report.txt")){
            String report = student.getName() + " - " + student.getRole() + " - " + student.calculateAverage();
            writer.write(report);
        } catch (IOException e){
            System.out.println("Something went wrong with writing this file: " + e.getMessage());
        }
    }

    public static void readReport(){
        try{
            File file = new File("student_report.txt");
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
