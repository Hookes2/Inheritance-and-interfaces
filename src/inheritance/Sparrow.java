package inheritance;

public class Sparrow extends Bird implements Flyable{
    public Sparrow(int age, int weightInLbs, String gender)
    {
        super(age, weightInLbs, gender);
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying...");
    }
}
