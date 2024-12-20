package BasicMath;

import java.util.Scanner;

public class EuclideanAlgorithm {
    public  static int GCD(int a,int b){
        while(b > 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter A and B: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("GCD : "+ GCD(a,b));
            System.out.println("-------------------------------------");
        }
    }
}
