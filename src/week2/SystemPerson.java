package week2;

public abstract class SystemPerson {
    protected String name;
    protected int age;

    public SystemPerson(String name, int age){
        this.name = name;
        this.age = age;
    }

    public abstract String getRole();

    public void printDetails(){
        System.out.println("Name: " + name + " Age: " + age);
    }
}
