package thread;

import java.security.spec.ECField;

public class Bank {
    private static int initial = 100;
    private int accountNumber;
    private String accountHolderName;
    private int balance;

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount){
        if(amount < 0 ) {
            System.out.println("Invalid amount entry");
            return;
        }
        else{
            balance+= amount;
            System.out.println("Amount deposited");
            System.out.println("Available Balance :"+ getBalance());
        }
    }
    synchronized public void withdraw(int amount){
        if(amount < 0) System.out.println("Invalid amount entry");
        if( amount > balance) System.out.println("Insufficient Balance");
        else{
            balance -= amount;
            System.out.println("Amount withdrawn successfully");
            System.out.println("Available Balance :"+getBalance());
        }
    }

    public Bank(String name){
        accountHolderName = name;
        accountNumber = initial++;
        balance = 0;
    }

}

