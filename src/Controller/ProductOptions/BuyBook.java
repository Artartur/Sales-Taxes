package Controller.ProductOptions;
import Model.Product;

import java.util.Scanner;

public class BuyBook {
    public static Product buyBook(Scanner scanner){
        Product book = new Product();

        System.out.println("What product do you want to buy?");
        book.setProductName(scanner.next());
        System.out.println("How much is this product?");
        book.setPrice(scanner.nextDouble());
        System.out.println("How many " + book.getProductName()+ " do you want?");
        book.setAmount(scanner.nextInt());
        System.out.println("Is the product imported?");
        System.out.println("Enter: \n 1 - Yes \n 2 - No");
        book.isImported = scanner.nextInt();
        if (book.isImported == 1) {
            book.importTax();
        } else if (book.isImported == 2) {
            book.getPrice();
        } else {
            System.out.println("Enter a valid number");
        }

        return book;
    }
}
