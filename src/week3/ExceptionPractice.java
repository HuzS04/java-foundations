package week3;

public class ExceptionPractice {
    public static double safeDivide(int num1, int num2) {
        double result = 0;
        try {
            int intResult = num1 / num2;  // int division — this throws if num2 is 0
            result = intResult;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
        return result;
    }

    public static int getElement(int[] elements, int index){
        int result = 0;
        try{
            result = elements[index];
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index doesnt exist");
            result = -1;
        }
        return result;
    }
}
