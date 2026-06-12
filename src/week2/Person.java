package week2;

public class Person {
    private String name;
    private int age;
    private String occupation;

    public Person(String name, int age, String occupation){
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    public void introduce(){
        System.out.println("Hi, I'm " + name + ", I'm " + age + " years old and I work as a " + occupation);
    }
}
