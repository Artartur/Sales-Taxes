package Controller.ProductOptions;

import Model.Products.Foods;
import Model.Product;

import java.util.Scanner;

public class BuyFood {
    public static Product buyFood(Scanner scanner){
        Product food = new Product();
        System.out.println("Which is the product would you like to buy? \n 1 - Box of chocolate \n 2 - Brigadeiro \n 3 - Chocolate bar");
        int foodOption = scanner.nextInt();

        switch (foodOption){
            case 1:
                food.setProductName(Foods.CHOCOLATE.getProductName());
                food.setPrice(Foods.CHOCOLATE.getPrice());
                break;
            case 2:
                food.setProductName(Foods.BRIGADEIRO.getProductName());
                food.setPrice(Foods.BRIGADEIRO.getPrice());
                break;
            case 3:
                food.setProductName(Foods.CHOCOLATE_BAR.getProductName());
                food.setPrice(Foods.CHOCOLATE_BAR.getPrice());
                break;
            default:
                System.out.println("Enter a valid number");
                break;
        }
        System.out.println("How many "+food.getProductName() +" do you want?");
        food.setAmount(scanner.nextInt());
        System.out.println("Is the product imported?");
        System.out.println("Enter: \n 1 - Yes \n 2 - No");
        food.isImported = scanner.nextInt();
        if (food.isImported == 1) {
            System.out.println(food.testImport());
        } else if (food.isImported == 2) {
            System.out.println(food.getPrice());
        } else {
            System.out.println("Enter a valid number");
        }
        return food;
    }
}
