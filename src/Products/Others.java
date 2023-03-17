package Products;

public enum Others {
    BIKE("Bike", 10.0),
    CD("Music CD", 14.99),
    PERFUME("Bottle of perfume", 47.50);

    private final String productName;
    private final double price;

    private Others(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName(){
        return productName;
    }
    public double getPrice() {
        return price;
    }
}
