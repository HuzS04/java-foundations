package week3;

import java.util.List;

public class ListPractice {

    public static String findLongest(List<String> phrases){
        String longest = phrases.get(0);
        for(String phrase : phrases){
            if(phrase.length() > longest.length()){
                longest = phrase;
            }
        }
        return longest;
    }

    public static void removeShortWords(List<String> phrases){
        for (String phrase : phrases){
            System.out.println(phrase);
        }
        phrases.removeIf(phrase -> phrase.length() < 4);
        for (String phrase : phrases){
            System.out.println(phrase);
        }
    }
}
