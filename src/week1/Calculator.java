package week1;

public class Calculator {
    public static double add(double a, double b){
        return a + b;
    }

    public static double subtract(double a, double b){
        return a - b;
    }

    public static double multiply(double a, double b){
        return a * b;
    }

    public static double divide(double a, double b){
        if (b == 0){
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return a / b;
    }

    public static boolean isEven(int n){
        return n % 2 == 0;
    }

    public static int factorial(int n){
        int sum = 1;
        for(int i = n; i >= 1; i--){
            sum = sum * i;
        }
        return sum;
    }

    public static void main(String[] args){
        System.out.println(add(10, 5));
        System.out.println(subtract(10, 5));
        System.out.println(multiply(10, 5));
        System.out.println(divide(10, 0));
        System.out.println(isEven(5));
        System.out.println(factorial(5));
    }
}
