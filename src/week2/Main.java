package week2;

public class Main {
    public static void main(String[] args){
        Person person1 = new Person("Huzaifah", 21, "Developer");
        person1.setOccupation("Engineer");
        System.out.println(person1.getName());
        System.out.println(person1.getOccupation());
        person1.setAge(-21);
    }
}
