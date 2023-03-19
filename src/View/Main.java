package View;

import Controller.ProductOptions.ExemptProducts;
import Controller.ProductOptions.BuyOther;
import Model.Product;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

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
            System.out.println("Enter the number representing the product you would like to buy: ");
            System.out.println(" 1 - Food, Book or Medical products \n 2 - Other \n 0 - Cancel");
            option = inputScanner.nextInt();
        }


        double price= 0;
        double priceTaxed = 0;

        String prod = products.stream().map(product -> String.format("%s", product.getProductName())).collect(Collectors.joining(", \n"));
        System.out.println(prod);

        //ExemptProducts

        price = products.stream().mapToDouble(Product::getPrice).reduce(0, Double::sum);
        priceTaxed = products.stream().mapToDouble(Product::importTax).reduce(0, Double::sum);
        System.out.println("price: "+ price);
        System.out.println("Sales Taxes: " + (priceTaxed-price));
        System.out.println("Total: "+ (priceTaxed));


        // Others

        price = products.stream().mapToDouble(Product::getPrice).reduce(0, Double::sum);
        priceTaxed = products.stream().mapToDouble(Product::importTaxPlusTax).reduce(0, Double::sum);

        System.out.println("Sales Taxes: " + (priceTaxed-price));
        System.out.println("Total: "+ (priceTaxed));

        price = products.stream().mapToDouble(Product::getPrice).reduce(0, Double::sum);
        priceTaxed = products.stream().mapToDouble(Product::tax).reduce(0, Double::sum);

        System.out.println("Sales Taxes: " + (priceTaxed-price));
        System.out.println("Total: "+ (priceTaxed));


    }
    }

