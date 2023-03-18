package Controller.ImportSettings;

import Model.Product;

import java.util.ArrayList;

public class OtherProducts {
    public static void otherProducts(ArrayList<Product> products){
        double total = 0;
        double amountTaxes = 0;
        for (Product product : products){
            switch(product.isImported){
                case 1:
                    System.out.printf("%d - %s: %.2f\n", product.getAmount(), product.getProductName(), product.testImportPlus());
                    amountTaxes += product.amountTaxes();
                    total += product.testImportPlus() * product.getAmount();
                    break;
                case 2:
                    System.out.printf("%d - %s: %.2f\n", product.getAmount(), product.getProductName(), product.test());
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
