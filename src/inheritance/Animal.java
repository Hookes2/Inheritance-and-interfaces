package inheritance;

public class Animal {
    private int age;
    private int weightInLbs;
    private String gender;

    public Animal(int age, int weightInLbs, String gender) {
        this.age = age;
        this.weightInLbs = weightInLbs;
        this.gender = gender;
    }

    public void eat()
    {
        System.out.println("Eating...");
    }

    public void sleep(){
        System.out.println("Sleeping...");
    }

    public void walk(){
        System.out.println("Walking...");
    }
}
