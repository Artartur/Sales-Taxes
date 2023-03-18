package Model.Products;

public enum Books {
    HARRY_POTTER("Harry Potter", 32.00),
    LORD_OF_THE_RINGS("Lord Of The Rings", 45.00),
    GAME_OF_THRONES("Game of Thrones", 50.00);


    private final String productName;
    private final double price;

    private Books(String productName, double price) {
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
