package inheritance;

public class Fish extends Animal{
    public Fish(int age, int weightInLbs, String gender)
    {
        super(age, weightInLbs, gender);
    }

    public void swim(){
        System.out.println("Swimming...");
    }
}
