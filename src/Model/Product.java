package Model;

public class Product {
    private int amount;
    public int isImported;
    private double price;
    private String productName;
    private final double salesTax = 1.10;
    private final double importTax = 1.05;
    private final double importTaxPlusSalesTax = 1.15;

    public double tax(){
        return price * amount * salesTax;
    }

    public double importTax(){
        return price * amount * importTax;
    }
    public double importTaxPlusTax(){
        return price * amount * importTaxPlusSalesTax;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

}
