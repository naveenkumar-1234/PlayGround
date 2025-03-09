package DayChallenge.DaySeven;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private static List<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added successfully! "+ book.getBookTitle());
    }
    public void displayBooks(){
        for(Book book : books) System.out.println("Book --" + book.getBookTitle());
    }

}
