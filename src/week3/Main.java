package week3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<String> foods = new ArrayList<>();

        foods.add("Pizza");
        foods.add("Burger");
        foods.add("Pasta");
        foods.add("Pie");
        foods.add("Chips");

        for (String food : foods) {
            System.out.println(food);
        }

        System.out.println("Longest food: " + ListPractice.findLongest(foods));
        ListPractice.removeShortWords(foods);
    }
}
