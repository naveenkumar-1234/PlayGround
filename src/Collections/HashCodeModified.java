package Collections;

import java.util.HashSet;
import java.util.Set;

public class HashCodeModified {

    public static void main(String[] args) {
        Book book1 = new Book("Sciene","Newton");
        Book book2 = new Book("Sciene","Newton");
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book1.equals(book1));
        System.out.println(book1.getClass().getName());
        Set<Book> bookHashSet = new HashSet<>();
        bookHashSet.add(book1);
        bookHashSet.add(book2);
        System.out.println(bookHashSet);
    }
}
