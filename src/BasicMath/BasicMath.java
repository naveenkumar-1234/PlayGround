package BasicMath;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class BasicMath {
    public static int countDigit(int num){
        int count=0;
        while(num>0){
            num/=10;
            count++;
        }
        return count;
    }
    public static int reverseNumber(int num){
        int rev=0;
        while(num>0){
            rev=rev*10+(num%10);
            num/=10;
        }
        return rev;
    }
    public static boolean checkPalindrome(int num){
        int rev=0;
        int temp=num;
        while(num>0){
            rev=rev*10+(num%10);
            num/=10;
        }
        return rev == temp;
    }
    public static int GCD(int n1,int n2){
        int min = n1 < n2? n1 : n2;
        for(int i=min;i>=1;i--){
            if(n1%i == 0 && n2%i==0 ) return i;
        }
        return 0;
    }
    public static boolean ArmstrongNumber(int num){
        List<Integer> lt = new ArrayList<>();
        int temp=num;
        int cnt=0;
        while(num>0){
            lt.add(num%10);
            num/=10;
            cnt++;
        }
        int arm=0;
        for(int i: lt){
            arm+=Math.pow(i,cnt);
        }
        return temp == arm;
    }
    public static boolean isPrime(int num){
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num % i == 0) return false;
        }
        return true;
    }
    public static void divisors(int num){
        List<Integer> lt = new ArrayList<>();

        for(int i=1;i<=Math.sqrt(num);i++){
                if(num % i == 0){
                    lt.add(i);
                    if(i==num/i) break;
                    lt.add(num/i);
                }
        }
        Collections.sort(lt);
        for(int i : lt) System.out.println(i);
    }
    public static void main(String[] args) {
        while(true){
            Scanner sc = new Scanner(System.in);

            System.out.println("1. Count digits");
            System.out.println("2. Reverse integer");
            System.out.println("3. Check Palindrome");
            System.out.println("4. GCD for Two numbers");
            System.out.println("5. Armstrong Number");
            System.out.println("6. Prime or Not");
            System.out.println("7. Print all Divisors");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter your number:");
                    System.out.println(countDigit(sc.nextInt()));
                    break;
                case 2:
                    System.out.println("Enter your number:");
                    System.out.println(reverseNumber(sc.nextInt()));
                    break;
                case 3:
                    System.out.println("Enter your number:");
                    System.out.println(checkPalindrome(sc.nextInt()));
                    break;
                case 4:
                    System.out.println("Enter your number A and B:");
                    System.out.println(GCD(sc.nextInt(),sc.nextInt()));
                    break;
                case 5:
                    System.out.println("Enter your number:");
                    System.out.println(ArmstrongNumber(sc.nextInt()));
                    break;
                case 6:
                    System.out.println("Enter your number:");
                    System.out.println(isPrime(sc.nextInt()));
                    break;
                case 7:
                    System.out.println("Enter your number:");
                    divisors(sc.nextInt());
                    break;
                default:
                    System.out.println("Invalid choice, Please try again!");
            }
            System.out.println("-----------------------------------------");
        }
    }

}
