import java.util.ArrayList;

public class LoopPractice {
    public static void main(String[] args){

        /*
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        for(int i = 1; i <= 20; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }


        double number = 100;

        while(number >= 1){
            System.out.println(number);
            number = number / 2;
        }
         */

        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
