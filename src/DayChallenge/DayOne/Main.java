package DayChallenge.DayOne;

public class Main {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount("Naveen");
        System.out.println(acc.getOwnerName());
        System.out.println(acc.getBalance());
        acc.deposit(1000);
        System.out.println(acc.getBalance());
        acc.withdraw(1500);
        acc.withdraw(500);
        System.out.println(acc.getBalance());
    }

}
