package DayChallenge.DaySix;

public class Main {
    public static void main(String[] args) {
        Calculator basic = new Calculator();
        System.out.println(basic.add(1 ,2 ));
        System.out.println(basic.add(2 ,2 ,5 ,1));

        Calculator special = new Calculator("John");
        System.out.println(special.add(1,2,4));
        System.out.println(special.add(1.2,2.2,4.1));
    }
}
class Calculator{
    public Calculator(){
        System.out.println("Calculator started");
    }
    public Calculator(String str){
        System.out.println("Calculator started by" + str);
    }
    //using varargs
    public int add( int... args){
        int sum = 0;
        for( int num : args) sum+=num;
        return sum;
    }
    public double add(double... args){
        double sum = 0.0;
        for(double num : args) sum+= num;
        return sum;
    }
//    public int add(int one , int two){
//        return one+two;
//    } public int add(int one , int two ,int three){
//        return one+two+three;
//    } public int add(int one , int two, int three ,  int four){
//        return one+two+three+four;
//    } public double add(double one , double two){
//        return one+two;
//    } public double add(double one , double two, double three){
//        return one+two+three;
//    }

}
