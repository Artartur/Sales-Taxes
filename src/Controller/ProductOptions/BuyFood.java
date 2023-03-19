package Controller.ProductOptions;
import Model.Product;
import java.util.Scanner;

public class BuyFood {
    public static Product buyFood(Scanner scanner){
        Product food = new Product();

        System.out.println("What product do you want to buy?");
        food.setProductName(scanner.next());
        System.out.println("How much is this product?");
        food.setPrice(scanner.nextDouble());
        System.out.println("How many "+food.getProductName() +" do you want?");
        food.setAmount(scanner.nextInt());
        System.out.println("Is the product imported?");
        System.out.println("Enter: \n 1 - Yes \n 2 - No");
        food.isImported = scanner.nextInt();
        if (food.isImported == 1) {
            food.testImport();
        } else if (food.isImported == 2) {
            food.getPrice();
        } else {
            System.out.println("Enter a valid number");
        }
        return food;
    }
}
