package week2;

public class Student extends SystemPerson implements Printable{
    int[] grades;

    public Student(String name, int age, int[] grades){
        super(name, age);
        this.grades = grades;
    }

    @Override
    public String getRole() {
        return "Student";
    }

    public double calculateAverage(){
        int length = grades.length;
        int sum = 0;
        for(int grade : grades){
            sum += grade;
        }
        return (double)sum / length;
    }

    @Override
    public void printReport(){
        System.out.println("Name: " + name);
        System.out.println("Role: " + getRole());
        System.out.println("Average grade: " + calculateAverage());
    }
}
