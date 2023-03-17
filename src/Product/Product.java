package Product;

public class Product {
    private int amount;
    public int isImported;
    private double price;
    private String productName;
    private final double tax = 1.10;
    private final double importTax = 1.05;
    private final double importTaxPlusTax = 1.15;
    private double total;

    public double tax(){
        return (price * amount) * tax;
    } // Imposto para produtos Others nao importados
    public double importTaxPlusTax(){
        return price * amount * importTaxPlusTax;
    }  // Imposto para produtos Others importados
    public double importTax(){
        return price * amount * importTax;
    } // Imposto para produtos importados
    public double amountTaxes(){
        return tax() - importTax();
    } // Quantidade de imposto que foi cobrado ao todo

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

    public double getTax() {
        return tax;
    }

    public double getImportTax() {
        return importTax;
    }

    public double getImportTaxPlusTax() {
        return importTaxPlusTax;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return  getAmount() + " "+getProductName() + ':' + getPrice() +
                "\nSales Taxes: " + amountTaxes() +
                "\nTotal: " + total;
    }

}
