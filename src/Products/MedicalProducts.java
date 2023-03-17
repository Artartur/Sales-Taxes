package Products;

public enum MedicalProducts {
    HEADACHE_PILLS("Headache Pills", 9.75),
    STOMACHACHE_PILLS("Stomachace Pills", 8.00),
    PAINKILLERS("Painkillers", 15.00);

    private final String productName;
    private final double price;

    private MedicalProducts(String productName, double price) {
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
