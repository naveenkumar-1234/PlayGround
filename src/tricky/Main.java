package tricky;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> wrongAttempts = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            int attempt = 0;
            final int MAX_ATTEMPTS = 5;
            final int VALID_ATTEMPTS = 3;
            int validAttempts = 0 ;
            final int myGuessNum = 0;
            do {
                int a;
                try{
                    if(attempt >= MAX_ATTEMPTS ){
                        System.out.println("Reached maximum attempt buddy , try after some time");
                        break;
                    }
                    if(validAttempts >= VALID_ATTEMPTS){
                        System.out.println("😵 You're out of chances! The number was 0.");
                        break;
                    }
                    long startTime = System.nanoTime();

                    System.out.print("Enter an integer :");
                    a = sc.nextInt();
                    if(a == -1){
                        System.out.println("You entered -1 : Exited");
                        break;
                    }
                    if(a != myGuessNum) {
                        wrongAttempts.add(a);
                        validAttempts++;
                        throw new Exception("Waiting for my guess number");
                    }

                    System.out.println("Great,you got my number which is " + myGuessNum);
                    if(wrongAttempts.isEmpty()) System.out.println("WTF you got it! in first attempt ");
                    else{
                        System.out.println("🔥 You got it within 3 attempts! You're a genius!");
                        System.out.println("🔥 Your horrible wrong attempts: " + wrongAttempts);
                    }
                    break;
                }catch (InputMismatchException inputMismatchException){
                    System.out.println("Please enter a valid integer");
                    attempt++;
                    System.out.println("Remaining attempts :"+ (5 - attempt));
                    sc.nextLine();
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }

            }while (true);
            sc.close();
    }
}
