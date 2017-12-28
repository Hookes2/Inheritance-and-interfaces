package inheritance;

public class Zoo {
    public static void main(String[] args)
    {
//        Bird bird1 = new Bird(4, 10, "Female");
//        bird1.fly();
//        bird1.sleep();
//        bird1.eat();
//        bird1.walk();

        Chicken chick1 = new Chicken(1, 5, "Male");
        chick1.eat();
//        chick1.fly();   /** chicken can't fly **/

        Sparrow sparrow = new Sparrow(2, 6, "Female");
        sparrow.fly();
    }

}
