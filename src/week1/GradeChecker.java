package week1;

public class GradeChecker {
    public static void main(String[] args){

        int score = 60;
        String grade;

        if(score >= 70){
            System.out.println("Distinction");
            grade = "Distinction";
        } else if (score >= 50) {
            System.out.println("Pass");
            grade = "Pass";
        } else {
            System.out.println("Fail");
            grade = "Fail";
        }

        switch(grade){
            case "Distinction":
                System.out.println("Excellent");
                break;
            case "Pass":
                System.out.println("Good effort");
                break;
            case "Fail":
                System.out.println("Keep going");
                break;
            default:
                System.out.println("Unknown grade");
        }
    }
}
