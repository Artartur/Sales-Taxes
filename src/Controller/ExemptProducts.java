package Controller;
import Model.Product;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemptProducts {
    public static Product BuyExemptProducts(Scanner scanner) {
        Product product = new Product();

        try {
            System.out.println("What product do you want to buy?");
            product.setProductName(scanner.next());
            scanner.nextLine();

            System.out.println("How much is this product?");
            while (!scanner.hasNextDouble()) {
                System.out.println("Please enter a valid price:");
                scanner.next();
            }
            double initialPrice = scanner.nextDouble();
            scanner.nextLine();
            product.setPrice(initialPrice);
            product.setFinalPrice(initialPrice);

            System.out.println("How many " + product.getProductName() + " do you want?");
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid number:");
                scanner.next();
            }
            product.setAmount(scanner.nextInt());
            scanner.nextLine();

            System.out.println("Is the product imported?");
            System.out.println("Enter: \n 1 - Yes \n 2 - No");
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid number:");
                scanner.next();
            }
            int isImported = scanner.nextInt();
            scanner.nextLine();
            product.setProductType(isImported == 1 ? Product.ProductType.IMPORTED : Product.ProductType.NOT_IMPORTED);

            if (product.getProductType() == Product.ProductType.IMPORTED) {
                product.importTax();
            } else {
                product.getPrice();
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        return product;
    }
}
