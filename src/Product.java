public class Product {
    public double amount;
    public int isImported;
    public int option;
    public double price;
    public String productName;
   public double total;

    public double tax(){
        return (price * amount) * 1.10;
    }
    public double totalTaxes(){
        return tax() || importTax() - price*amount;
    }
    public double importTax(){
        return price * amount * 1.05;
    }
    public double importTaxPlusTax(){
        return price * amount * 1.15;
    }

}
