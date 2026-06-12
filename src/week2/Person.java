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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.isEmpty()){
            System.out.println("Please enter a name!");
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(0 <= age && age <= 120){
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        if(occupation == null || occupation.isEmpty()){
            System.out.println("Please enter an occupation!");
        } else {
            this.occupation = occupation;
        }
    }
}
