package Controller.ImportSettings;

import Model.Product;

import java.util.ArrayList;

public class ExceptProducts {
    public static void exceptProducts(ArrayList<Product> products){
        double total = 0;
        double amountTaxes = 0;
        for (Product product : products){
            switch (product.isImported){
                case 1:
                    System.out.printf("%d - imported %s: %.2f\n", product.getAmount(), product.getProductName(), product.testImport());
                    amountTaxes += product.amountTaxes();
                    total += product.testImport() * product.getAmount();
                    break;
                case 2:
                    System.out.printf("%d - %s: %.2f\n", product.getAmount(), product.getProductName(), product.getPrice());
                    total += product.getPrice() * product.getAmount();
                    break;
                default:
                    System.out.println("Enter a valid number");
                    break;
            }
        }
        System.out.printf("Sales Taxes: %.2f\n", amountTaxes);
        System.out.printf("Total: %.2f", total);
    }
}
