package lambda;

public class Main {
    public static void main(String[] args) {
        Calculator add = (a ,b) -> a+b ;

        Calculator sub = (a,b) -> a-b;
        Calculator mul = (a,b) -> a*b;

        System.out.println(add.operation(10,5));
        System.out.println(sub.operation(10,5));
        System.out.println(mul.operation(10,5));

        //Method referencing
        Calculator addition = Main::add;
        System.out.println(addition.operation(10,20));

    }
    public static int add(int a , int b){
        return a + b;
    }
}
