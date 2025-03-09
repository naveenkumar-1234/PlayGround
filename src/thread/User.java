package thread;

public class User extends Thread{
    Bank bk ;
    public User(Bank bank){
        bk = bank;
    }
    @Override
    public void run(){
            bk.withdraw(1000);
    }

}
