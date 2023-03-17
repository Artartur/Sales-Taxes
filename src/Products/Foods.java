package Products;

public enum Foods {
    CHOCOLATE("Box of Chocolates", 10.00),
    BRIGADEIRO("Brigadeiro", 5.00),
    CHOCOLATE_BAR("Chocolate bar", 0.85);

    private final String productName;
    private final double price;

    private Foods(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}
