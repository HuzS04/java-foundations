package week3;

import java.util.*;

public class SetMapPractice {
    public static void main(String[] args) {
        Set<String> countries = new HashSet<>();
        Map<String, Integer> students = new HashMap<>();

        countries.add("England");
        countries.add("America");
        countries.add("Italy");
        countries.add("France");
        countries.add("England");

        students.put("Bob", 21);
        students.put("Luke", 23);
        students.put("Dave", 22);
        students.put("Steve", 24);

        for (String country : countries) {
            System.out.println(country);
        }

        for(Map.Entry<String, Integer> entry : students.entrySet()){
            System.out.println(entry.getKey() + " is " + entry.getValue() + " years old.");
        }
    }

    public static Map<String, Integer> countWordFrequency(List<String> words){
        Map<String, Integer> frequency = new HashMap<>();
        for(String word : words){
            if(frequency.containsKey(word)){
                frequency.put(word, frequency.get(word) + 1);
            } else {
                frequency.put(word, 1);
            }
        }
        return frequency;
    }
}
