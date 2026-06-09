public class Assessment {
    public static int countEvens(int[] numbers){
        int count = 0;
        for(int number : numbers){
            if(number % 2 == 0){
                count += 1;
            }
        }
        return count;
    }

    public static boolean isPrime(int num){
        if(num < 2){
            return false;
        } else if (num == 2) {
            return true;
        } else {
            for(int n = 2; n <= num - 1; n++){
                if(num % n == 0){
                    return false;
                }
            }
        }
        return true;
    }

    public static String reverseString(String phrase){
        String revPhrase = "";
        for(int i = phrase.length() - 1; i >= 0; i--){
            revPhrase = revPhrase + phrase.charAt(i);
        }
        return revPhrase;
    }

    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4, 5, 6};
        int num1 = 6;
        String phrase1 = "hello";

        System.out.println(countEvens(nums));
        System.out.println(isPrime(num1));
        System.out.println(reverseString(phrase1));
    }
}
