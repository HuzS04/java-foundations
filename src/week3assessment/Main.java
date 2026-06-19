package week3assessment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Bob", 1);
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Dave", 2);

        List<String> words = new ArrayList<>(List.of("Car", "Shoe", "Cat", "Shoe", "Car", "Car"));

        try{
            System.out.println(Week3Assessment.safeGetFromMap(map1, "Bob"));
        } catch (KeyNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try{
            System.out.println(Week3Assessment.safeGetFromMap(map2, "Bob"));
        } catch (KeyNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }

        Week3Assessment.writeUniqueWords(words);
    }
}
