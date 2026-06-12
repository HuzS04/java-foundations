package week1;

public class ArrayPractice {

    public static int getSum(int[] numbers){
        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        return sum;
    }

    public static int getMax(int[] numbers){
        int max = numbers[0];
        for (int number : numbers){
            if (number > max){
                max = number;
            }
        }
        return max;
    }

    public static void reverse(int[] numbers){
        for(int i = numbers.length - 1; i >= 0; i--){
            System.out.println(numbers[i]);
        }
    }

    public static void main(String[] args){
        int[] num = {1, 2, 3, 4, 5};
        reverse(num);
    }
}
