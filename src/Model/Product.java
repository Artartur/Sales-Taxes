package Model;

public class Product {
    private int amount;
    public int isImported;
    private double price;
    private double finalPrice;
    private String productName;
    private final double salesTax = 1.10;
    private final double importTax = 1.05;
    private final double importTaxPlusSalesTax = 1.15;

    public void tax(){
        setFinalPrice(roundValues(getPrice() * amount * salesTax));
    }

    public void importTax(){
        setFinalPrice(roundValues(getPrice() * amount * importTax));
    }
    public void importTaxPlusTax(){
        setFinalPrice(roundValues(getPrice() * amount * importTaxPlusSalesTax));
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
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

    public static double roundValues(double value){
        return Math.round(value * 100) / 100.0;
    }
    @Override
    public String toString() {
        return  amount +" "+ productName + ": " + finalPrice;
    }
}
