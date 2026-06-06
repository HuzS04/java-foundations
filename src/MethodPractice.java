public class MethodPractice {

    public static boolean isEven(int value){
        return(value % 2 == 0);
    }

    public static int calculateArea(int width, int height){
        return width * height;
    }

    public static int maxOf(int val1, int val2){
        if (val1 >= val2) {
            return val1;
        } else {
            return val2;
        }
    }

    public static String fizzbuzz(int value){
        if ((value % 3 == 0) && (value % 5 == 0)){
            return "FizzBuzz";
        } else if (value % 5 == 0){
            return "Buzz";
        } else if (value % 3 == 0) {
            return "Fizz";
        } else {
            return String.valueOf(value);
        }
    }

    public static void main(String[] args){
        String result = fizzbuzz(7);
        System.out.println(result);
    }
}
