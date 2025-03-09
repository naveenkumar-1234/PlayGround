package inheritance;

public class Book {
    protected String tittle;
    protected String author;
    protected int ISBN;
    protected int price;

    Book(String tittle, String author, int ISBN, int price){
        this.tittle = tittle;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
    }

    public String getAbsTittle(){
        return tittle;
    }
    public String getTittle(){
        return "Tittle : "+tittle;
    }
    public void setTittle(String tittle){
        this.tittle = tittle;
    }
    public String getAuthor(){
        return "Author : "+author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public int getISBN(){
        return ISBN;
    }
    public void setISBN(int ISBN){
        this.ISBN = ISBN;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public String getDetails(){
        return getTittle()+"\n"+getAuthor()+"\nISBN : "+getISBN()+"\nPrice : "+getPrice();
    }
}
