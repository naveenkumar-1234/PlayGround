package Collections;

import java.util.Objects;

public class Book  {
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }


    private String title;
    private String author;

    @Override
    public int hashCode(){
        return Objects.hashCode(title);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj.getClass() != getClass()) return false;
        Book book = (Book) obj;
        if( book.title.equals(this.title) ) return true;
        return false;
    }

    @Override
    public String toString(){
        return "title :" +title +" Author :" +author;
    }



}
