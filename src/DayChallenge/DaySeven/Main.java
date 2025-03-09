package DayChallenge.DaySeven;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();
        library.addBook(new Book("Atomic habits"));
        library.addBook(new Book("Psychology of Money"));

        library.displayBooks();

    }
}
