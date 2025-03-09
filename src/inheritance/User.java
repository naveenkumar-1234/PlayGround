package inheritance;

public class User {
    static int init = 100;
    private int id ;
    private String name;
    private String password;
    private int money;
    private String type ;
    private String address;
    User(String name,String password){
        this.name = name;
        this.password = password;
        this.id = init++;
        this.money= 0;

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }

    public void setType(String type){
        this.type = type;

    }
    public String getType(){
        return type;
    }


    public int getMoney(){
        return money;
    }
    public void setMoney(int money){
        this.money += money;
    }
    public void orderMinusBal(int money){
        this.money -= money;
    }
    @Override
    public String toString(){
        return id+" "+name+" "+money;
    }
}
