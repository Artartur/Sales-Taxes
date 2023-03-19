package Controller.ProductOptions;
import Model.Product;
import java.util.Scanner;

public class BuyFood {
    public static Product buyFood(Scanner scanner){
        Product product = new Product();

        System.out.println("What product do you want to buy?");
        product.setProductName(scanner.next());
        System.out.println("How much is this product?");
        product.setPrice(scanner.nextDouble());
        System.out.println("How many "+product.getProductName() +" do you want?");
        product.setAmount(scanner.nextInt());
        System.out.println("Is the product imported?");
        System.out.println("Enter: \n 1 - Yes \n 2 - No");
        product.isImported = scanner.nextInt();
        if (product.isImported == 1) {
            product.importTax();
        } else if (product.isImported == 2) {
            product.getPrice();
        } else {
            System.out.println("Enter a valid number");
        }
        return product;
    }
}
