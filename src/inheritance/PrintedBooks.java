package inheritance;

public class PrintedBooks extends Book{
        protected double weight;
        protected int shippingCost;


    PrintedBooks(String tittle, String author, int ISBN, int price,double weight, int shippingCost) {
        super(tittle, author, ISBN, price);
        this.weight = weight;
        this.shippingCost = shippingCost;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public double getWeight(){
        return weight;
    }

    public void setShippingCost(int shippingCost){
        this.shippingCost = shippingCost;
    }
    public String getShippingCost(){
        return "Shipping Cost : "+shippingCost;
    }

    @Override
    public String getDetails() {
        return super.getDetails()+"\nFileSize : "+getWeight()+"\n"+getShippingCost();
    }
}
