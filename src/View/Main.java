package View;

import Controller.ExemptProducts;
import Controller.BuyOther;
import Model.Product;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner inputScanner = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<Product>();
        ExemptProducts exemptProductsInstances = new ExemptProducts();
        BuyOther otherInstances = new BuyOther();

        System.out.println("Welcome to RayMarket!");
        System.out.println("How can I help you?");
        System.out.println("How many product do you want to buy? ");
        int a = inputScanner.nextInt();
        int[] array = new int[a];
        System.out.println("Enter the number representing the product you would like to buy: ");
        System.out.println(" 1 - Food, Book or Medical products \n 2 - Other \n 0 - Cancel");

        int option = inputScanner.nextInt();

        for(int i = 0; i < a; i++){

            switch (option) {
                case 1:
                    Product exemptProducts = exemptProductsInstances.BuyExemptProducts(inputScanner);
                    products.add(exemptProducts);
                    break;
                case 2:
                    Product other = otherInstances.buyOther(inputScanner);
                    products.add(other);
                    break;
                default:
                    System.out.println("Please, enter a valid number");
                    break;
            }
            if(a > 1){
                System.out.println("Enter the number representing the product you would like to buy: ");
                System.out.println(" 1 - Food, Book or Medical products \n 2 - Other \n 0 - Cancel");
                option = inputScanner.nextInt();
            }else{
                break;
            }

        }

        double price= 0;
        double finalPrice = 0;

        for(Product product : products){
            System.out.println(product.toString());
        }

        price = products.stream().mapToDouble(Product::getPrice).reduce(0, Double::sum);
        finalPrice = products.stream().mapToDouble(Product::getFinalPrice).reduce(0, Double::sum);
        System.out.printf("Sales Taxes: %.2f\n", finalPrice-price);
        System.out.println("Total: "+ (finalPrice));

    }
    }

