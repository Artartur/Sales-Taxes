package Controller.ProductOptions;
import Model.Product;
import java.util.Scanner;

public class BuyMedical {
    public static Product buyMedical(Scanner scanner){
        Product medical = new Product();

        System.out.println("What product do you want to buy?");
        medical.setProductName(scanner.next());
        System.out.println("How much is this product?");
        medical.setPrice(scanner.nextDouble());
        System.out.println("How many " + medical.getProductName() + " do you want?");
        medical.setAmount(scanner.nextInt());
        System.out.println("Is the product imported?");
        System.out.println("Enter: \n 1 - Yes \n 2 - No");
        medical.isImported = scanner.nextInt();
        if (medical.isImported == 1) {
            medical.importTax();
        } else if (medical.isImported == 2) {
            medical.getPrice();
        } else {
            System.out.println("Enter a valid number");
        }
        return medical;
    }
}
