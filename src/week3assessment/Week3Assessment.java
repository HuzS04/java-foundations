package week3assessment;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Week3Assessment {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        String name1 = "Bob";
        String name2 = "Steve";
        String name3 = "Micheal";

        names.add(name1);
        names.add(name2);
        names.add(name3);

        List<String> upperNames = names.stream()
                .filter(n -> n.length() > 4)
                .map(n -> n.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(upperNames);

    }

    public static int safeGetFromMap(Map<String, Integer> map, String key) throws KeyNotFoundException{
        if(map.containsKey(key)){
            return map.get(key);
        } else {
            throw new KeyNotFoundException("Key not found: " + key);
        }
    }

    public static void writeUniqueWords(List<String> words) {
        Set<String> uniqueWords = new HashSet<>(words);
        try(FileWriter writer = new FileWriter("unique_words.txt")){
            for(String word : uniqueWords){
                writer.write(word + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
