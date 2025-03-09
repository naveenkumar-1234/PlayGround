package DayChallenge.DaySeven;

public class Book {
    private final String bookTitle;

    Book(String bookTittle){
        this.bookTitle = bookTittle;
    }


    public String getBookTitle() {
        return bookTitle;
    }
    @Override
    public String toString(){
        return bookTitle;
    }
}
