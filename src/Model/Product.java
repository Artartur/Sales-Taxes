package Model;

public class Product {
    private int amount;
    public int isImported;
    private double price;
    private String productName;
    private final double salesTax = 0.10;
    private final double importTax = 0.05;
    private final double importTaxPlusSalesTax = 0.15;
    private double total;

    public double tax(){
        return price * amount * salesTax;
    } // Imposto para produtos Others nao importados
    public double test(){
        return price + tax();
    }
    public double testImport(){
        return price + importTax();
    }
    public double testImportPlus(){
        return price + importTaxPlusTax();
    }
    public double importTax(){
        return price * amount * importTax;
    } // Imposto para produtos importados
    public double importTaxPlusTax(){
        return price * amount * importTaxPlusSalesTax;
    }  // Imposto para produtos importados com taxas

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

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

//    @Override
//    public String toString() {
//        return  "\n"+ getAmount() + " "+getProductName() + ':' + getPrice() +
//                "\nSales Taxes: " + amountTaxes() +
//                "\nTotal: "+ getTotal() + "\n";
//    }

}
