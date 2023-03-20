package Controller;

import Model.Product;

import java.util.Scanner;

public class BuyOther {
    public static Product buyOther(Scanner scanner){
        Product other = new Product();
    try{
        System.out.println("What product do you want to buy?");
        other.setProductName(scanner.next());
        scanner.nextLine();

        System.out.println("How much is this product?");
        while (!scanner.hasNextDouble()) {
            System.out.println("Please enter a valid price:");
            scanner.next();
        }
        double initialPrice = scanner.nextDouble();
        scanner.nextLine();
        other.setPrice(initialPrice);
        other.setFinalPrice(initialPrice);

        System.out.println("How many " + other.getProductName() + " do you want?");
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid number:");
            scanner.next();
        }
        other.setAmount(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Is the product imported?");
        System.out.println("Enter: \n 1 - Yes \n 2 - No");
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid number:");
            scanner.next();
        }
        int isImported = scanner.nextInt();
        scanner.nextLine();
        other.setProductType(isImported == 1 ? Product.ProductType.IMPORTED : Product.ProductType.NOT_IMPORTED);
        if (other.getProductType() == Product.ProductType.IMPORTED) {
            other.importTaxPlusTax();
        } else{
            other.tax();
        }
    } catch (Exception e) {
        System.out.println("An error occurred: " + e.getMessage());
    }
        return other;
    }
}
