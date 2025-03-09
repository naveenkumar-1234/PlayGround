package thread;

public class Main {
    public static void main(String[] args) {
           Bank bank = new Bank("John");
           bank.deposit(1000);
            User user1 = new User(bank);
            User user2 = new User(bank);
            user1.start();
            user2.start();

        System.out.println(bank.getBalance());

    }
}


