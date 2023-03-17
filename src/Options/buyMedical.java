package Options;

import Product.Product;
import Products.MedicalProducts;

import java.util.Scanner;

public class buyMedical {
    public static void buyMedical(Scanner scanner){
        Product medical = new Product();
        System.out.println("Which is the product would you like to buy? \n 1 - Headache Pills \n 2 - Stomachache Pills \n 3 - Painkillers");
        int medicalOption = scanner.nextInt();
        switch (medicalOption) {
            case 1:
                medical.setProductName(MedicalProducts.HEADACHE_PILLS.getProductName());
                medical.setPrice(MedicalProducts.HEADACHE_PILLS.getPrice());
                break;
            case 2:
                medical.setProductName(MedicalProducts.STOMACHACHE_PILLS.getProductName());
                medical.setPrice(MedicalProducts.STOMACHACHE_PILLS.getPrice());
                break;
            case 3:
                medical.setProductName(MedicalProducts.PAINKILLERS.getProductName());
                medical.setPrice(MedicalProducts.PAINKILLERS.getPrice());
                break;
            default:
                System.out.println("Enter a validate number");
                break;
        }
        System.out.println("How many " + medical.getProductName() + " do you want?");
        medical.setAmount(scanner.nextInt());
        System.out.println("Is the product imported?");
        System.out.println("Enter: \n 1 - Yes \n 2 - No");
        medical.isImported = scanner.nextInt();
        if (medical.isImported == 1) {
            System.out.println(medical.importTax());
        } else if (medical.isImported == 2) {
            System.out.println(medical.getPrice());
        } else {
            System.out.println("Enter a valid number");
        }
    }
}
