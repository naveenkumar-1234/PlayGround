package inheritance;

public class EBooks extends Book{
    protected double fileSize;
    protected String format;


    EBooks(String tittle, String author, int ISBN, int price,double fileSize, String format) {
        super(tittle, author, ISBN, price);
        this.fileSize = fileSize;
        this.format = format;
    }
    public void setFileSize(double fileSize){
        this.fileSize = fileSize;
    }
    public double getFileSize(){
        return fileSize;
    }

    public void setFormat(String format){
        this.format = format;
    }
    public String getFormat(){
        return "Format : "+format;
    }

    @Override
    public String getDetails() {
        return super.getDetails()+"\nFileSize : "+getFileSize()+"\n"+getFormat();
    }
}
