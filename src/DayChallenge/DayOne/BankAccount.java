package DayChallenge.DayOne;

public class BankAccount {
    static int intial = 100;
    BankAccount(String name){
        ownerName = name;
        accountNumber = intial++;
        balance = 0;
    }
    private int accountNumber ;
    private String ownerName;
    private int balance;


    public int getAccountNumber(){
        return  accountNumber;
    }
    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }
    public String getOwnerName(){
        return ownerName;
    }
    public void deposit(int balance){
        if(balance > 0 ){
            this.balance += balance;
        }else{
            System.out.println("Invalid deposit amount");
        }
    }
    public boolean withdraw(int amount){
        if(amount <= 0){
            System.out.println("Invalid input");
            return false;
        }
        else if(this.balance < amount){
            System.out.println("Insufficient balance");
            return false;
        }else{
            this.balance -= amount;
            System.out.println("Withdrawn success: "+ amount);
            return true;
        }
    }
    public int getBalance(){
        return balance;
    }

}
