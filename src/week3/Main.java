package week3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<String> words = new ArrayList<>();

        words.add("Bob");
        words.add("Car");
        words.add("Bob");
        words.add("Shop");
        words.add("Cat");
        words.add("Shop");
        words.add("Bob");

        System.out.println(SetMapPractice.countWordFrequency(words));
    }
}
