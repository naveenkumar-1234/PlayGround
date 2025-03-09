package DayChallenge.DayFour;

public class Duck implements Flyable,Swimable{
    @Override
    public void fly() {
        System.out.println("I can Fly");
    }
    @Override
    public void swim(){
        System.out.println("I can swim");
    }
}
