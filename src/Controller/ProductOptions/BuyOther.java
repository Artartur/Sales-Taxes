package Controller.ProductOptions;

import Model.Product;
import Model.Products.Others;

import java.util.Scanner;

public class BuyOther {
    public static Product buyOther(Scanner scanner){
        Product other = new Product();
        System.out.println("Which is the product would you like to buy? \n 1 - Bike \n 2 - Music CD \n 3 - Bottle of Perfume");
        int otherOption = scanner.nextInt();
        switch (otherOption) {
            case 1:
                other.setProductName(Others.BIKE.getProductName());
                other.setPrice(Others.BIKE.getPrice());
                break;
            case 2:
                other.setProductName(Others.CD.getProductName());
                other.setPrice(Others.CD.getPrice());
                break;
            case 3:
                other.setProductName(Others.PERFUME.getProductName());
                other.setPrice(Others.PERFUME.getPrice());
                break;
            default:
                System.out.println("Enter a validate number");
                break;
        }
        System.out.println("How many "+ other.getProductName() +" do you want?");
        other.setAmount(scanner.nextInt());
        System.out.println("Is the product imported?");
        System.out.println("Enter: \n 1 - Yes \n 2 - No");
        other.isImported = scanner.nextInt();
        if ( other.isImported == 1) {
            System.out.println( other.importTaxPlusTax());
        } else if ( other.isImported == 2) {
            System.out.println( other.tax());
        } else {
            System.out.println("Enter a validate number");
        }
        return other;
    }
}
