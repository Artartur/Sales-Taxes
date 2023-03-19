package Controller.ProductOptions;

import Model.Product;

import java.util.Scanner;

public class BuyOther {
    public static Product buyOther(Scanner scanner){
        Product other = new Product();

        System.out.println("What product do you want to buy?");
        other.setProductName(scanner.next());
        System.out.println("How much is this product?");
        other.setPrice(scanner.nextDouble());
        System.out.println("How many "+ other.getProductName() +" do you want?");
        other.setAmount(scanner.nextInt());
        System.out.println("Is the product imported?");
        System.out.println("Enter: \n 1 - Yes \n 2 - No");
        other.isImported = scanner.nextInt();
        if ( other.isImported == 1) {
            other.importTaxPlusTax();
        } else if ( other.isImported == 2) {
            other.tax();
        } else {
            System.out.println("Enter a validate number");
        }
        return other;
    }
}
