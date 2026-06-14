package week2;

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
}
