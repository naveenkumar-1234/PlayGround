package inheritance;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Scanner sc1 = new Scanner(System.in);
    static Inventory inventory = new Inventory();

    static BookStore bookStore = new BookStore();
    public static void main(String[] args) {
//        System.out.println(bookStore.userList.size());
        Book book1 = new PrintedBooks("The Alchemist", "Paulo Coelho", 123456, 500, 0.75, 50);
        Book book2 = new PrintedBooks("Atomic Habits", "James Clear", 234567, 600, 0.80, 60);
        inventory.bookList.add(book2);
        inventory.bookList.add(book1);
        boolean flag = true;
        while (flag) {
            print("Welcome to Online BookStore");
            print("1.Create an account");
            print("2.Already have an Account");
            print("3.Exit");
            optPrint("Enter your choice:");
            int ch = sc.nextInt();
            switch (ch) {
                case 1 -> {
                    String name, pass;
                    optPrint("Enter your Name:");
                    name = sc1.nextLine();
                    optPrint("Enter your password:");
                    pass = sc1.next();
                    sc1.nextLine();
                    User user = new User(name, pass);
                    print("Account created successfully");
                    bookStore.userList.add(user);
                    boolean flag1 = true;
                    while (flag1) {
                        print("1.Wants to be a Customer");
                        print("2.Wants to be a Seller");
                        optPrint("Enter your choice: ");
                        int choice = sc.nextInt();
                        switch (choice) {
                            case 1 -> {
                                user.setType("buyer");
                                flag1 = false;
                            }
                            case 2 -> {
                                user.setType("seller");
                                print(user.getName() + " " + user.getType());
                                flag1 = false;
                            }
                            default -> print("Invalid option");
                        }
                    }
                }
                case 2 -> {
                    User user = null;
                    String name, pass;
                    boolean match = true;
                    do{

                        optPrint("Enter your Name: ");
                        name = sc1.nextLine();
                        optPrint("Enter your Password: ");
                        pass = sc1.next();
                        sc1.nextLine();
                        for(User us : bookStore.userList){
                            if(us.getName().equals(name) && us.getPassword().equals(pass)){
                                user = us;
                                match = false;
                            }
                            else print("Invalid credential");
                        }
                    }while(match);
                    if(user.getType().equals("seller")){
                      print("1.Add book");
                      print("2.Edit book");
                      int choice = sc.nextInt();
                      if(choice == 1){
                          Book book;
                          String tittle, author;
                          int ISBN, price;
                          print("1.PrintedBook");
                          print("2.EBook");
                          optPrint("Enter your choice: ");
                          int bookType = sc.nextInt();
                          optPrint("Enter Book tittle: ");
                          tittle = sc1.nextLine();
                          optPrint("Enter Author name: ");
                          author = sc1.nextLine();
                          optPrint("Enter the Book ISBN: ");
                          ISBN = sc1.nextInt();
                          optPrint("Enter Book Price: ");
                          price = sc.nextInt();
                          if (bookType == 1) {
                              optPrint("Enter the Book weight: ");
                              double weight = sc.nextDouble();
                              optPrint("Enter the shipping cost: ");
                              int shipCost = sc.nextInt();
                              sc1.nextLine();
                              sc.nextLine();
                              book = new PrintedBooks(tittle, author, ISBN, price, weight, shipCost);
                              inventory.bookList.add(book);
//                              book.getDetails();
                              print("Book added successfully");
                          } else {
                              optPrint("Enter the Book fileSize: ");
                              double fileSize = sc.nextDouble();
                              optPrint("Enter the Format(.pdf): ");
                              String format = sc1.nextLine();
                              sc1.nextLine();
                              sc.nextLine();
                              book = new EBooks(tittle, author, ISBN, price, fileSize, format);
                              inventory.bookList.add(book);
//                              book.getDetails();
                              print("Book added successfully");
                          }
                          System.out.println(inventory.bookList.size());
//                          for(Book bk : inventory.bookList){
//                              System.out.println(bk.getDetails());
//                          }
                      }else if(choice == 2){

                      }else{
                          print("Invalid choice");
                      }
                    }else if(user.getType().equals("buyer")){
                        boolean flag1 = true;
                        while (flag1){
                            print("1.Show all books");
                            print("2.Show Balance");
                            print("3.Add Balance");
                            print("4.Order book");

                            print("5.Exit");
                            int choice = sc.nextInt();

                            switch (choice){
                                case 1 ->{
                                    for(Book bk : inventory.bookList){
                                        print(bk.getDetails());
                                        print("-------------------------");
                                    }
                                }case 2 -> {
                                    print("Available balance : " + user.getMoney());
                                }case 3 -> {
                                    print("Enter the money to add: ");
                                    user.setMoney(sc.nextInt());

                                    print("Available balance : " + user.getMoney());
                                }case 4 ->{
                                    print("Enter the book name :");
                                    String bookTittle = sc1.nextLine();
                                    for(Book bk : inventory.bookList){
                                        if(bk.getAbsTittle().equals(bookTittle.trim())){
                                            print("Book available");
                                            print("Enter your book counts: ");
                                            int count = sc.nextInt();
                                            if(count * bk.getPrice() <= user.getMoney()){
                                                user.orderMinusBal(count * bk.getPrice());
                                                print("Order successful");
                                                print("Available balance "+user.getMoney());
                                            }else{
                                                print("Insufficient Balance");
                                            }
                                        }else{
                                            print("Book unavailable");
                                        }
                                    }
                                }
                                case 5 ->{
                                    flag1 = false;
                                }
                                default -> print("Invalid choice");
                            }
                        }
                    }

                }
                case 3 -> {
                    flag = false;
                    print("Exited");
                }
                default -> print("Invalid choice");
            }
        }


    }

    public static void addBook() {



    }

    public static String stringInp(String inp) {
        return sc1.nextLine();
    }

    public static int numInp(int num) {
        return sc.nextInt();
    }

    public static void print(String sentences) {
        System.out.println(sentences);
    }

    public static void optPrint(String option) {
        System.out.print(option);
    }


}
