package View;

import Controller.ImportSettings.OtherProducts;
import Controller.ProductOptions.BuyFood;
import Controller.ProductOptions.BuyBook;
import Controller.ProductOptions.BuyMedical;
import Controller.ProductOptions.BuyOther;
import Controller.ImportSettings.ExceptProducts;
import Model.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<Product>();

        BuyFood foodInstance = new BuyFood();
        BuyBook bookInstance= new BuyBook();
        BuyMedical medicalInstance = new BuyMedical();
        BuyOther otherInstance = new BuyOther();
        System.out.println("Welcome to RayMarket!");
        System.out.println("How can I help you?");
        System.out.println("Enter the number representing the product you would like to buy: ");
        System.out.println(" 1 - Food \n 2 - Book \n 3 - Medical products \n 4 - Other \n 0 - Cancel");

        int option= inputScanner.nextInt();
        
        while(option != 0) {

            switch (option) {
                case 1:
                    Product food = foodInstance.buyFood(inputScanner);
                    products.add(food);

                    break;
                case 2:
                   Product book = bookInstance.buyBook(inputScanner);
                   products.add(book);
                    break;
                case 3:
                    Product medical = medicalInstance.buyMedical(inputScanner);
                    products.add(medical);
                    break;
                case 4:
                    Product other = otherInstance.buyOther(inputScanner);
                    products.add(other);
                    break;
                default:
                    System.out.println("Please, enter a valid number");
            }

            System.out.println("Do you want to buy anything else? Enter: \n1 - Yes \n2 - No ");
            String add = inputScanner.next();
            if(add.equalsIgnoreCase("2")){
                break;
            }
            System.out.println(" 1 - Food \n 2 - Book \n 3 - Medical products \n 4 - Other \n 0 - Cancel");
            option = inputScanner.nextInt();
        }
        switch(option){
            case 1:
            case 2:
            case 3:
                ExceptProducts.exceptProducts(products);
                break;
            case 4:
                OtherProducts.otherProducts(products);
                break;
            default:
                System.out.println("Enter a valid number");
                break;
        }

    }
}