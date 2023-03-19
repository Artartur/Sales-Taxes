package View;

import Controller.ProductOptions.BuyBook;
import Controller.ProductOptions.BuyFood;
import Controller.ProductOptions.BuyMedical;
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

        BuyFood foodInstance = new BuyFood();
        BuyBook bookInstance = new BuyBook();
        BuyMedical medicalInstance = new BuyMedical();
        BuyOther otherInstance = new BuyOther();

        System.out.println("Welcome to RayMarket!");
        System.out.println("How can I help you?");
        System.out.println("How many product do you want to buy? ");
        int a = inputScanner.nextInt();
        int[] array = new int[a];
        System.out.println("Enter the number representing the product you would like to buy: ");
        System.out.println(" 1 - Food \n 2 - Book \n 3 - Medical products \n 4 - Other \n 0 - Cancel");

        int option = inputScanner.nextInt();

        for(int i = 0; i < a; i++){

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
                    break;
            }
            System.out.println("Enter the number representing the product you would like to buy: ");
            System.out.println(" 1 - Food \n 2 - Book \n 3 - Medical products \n 4 - Other \n 0 - Cancel");
            option = inputScanner.nextInt();
        }


        double price= 0;
        double priceTaxed = 0;
        double priceImportTaxed = 0;
        double priceImportPlusTaxed = 0;
                    String prod = products.stream().map(product -> String.format("%s", product.getProductName())).collect(Collectors.joining(", \n"));
                    System.out.println(prod);
                    price = products.stream().mapToDouble(Product::getPrice).reduce(0, Double::sum);
                    priceTaxed = products.stream().mapToDouble(Product::importTax).reduce(0, Double::sum);
                    priceImportPlusTaxed = products.stream().mapToDouble(Product::importTaxPlusTax).reduce(0, Double::sum);
                    System.out.println("Sales Taxes: " + priceTaxed);
                    System.out.println("Total: "+ (priceTaxed + price));

                    price = products.stream().mapToDouble(Product::getPrice).reduce(0, Double::sum);
                    priceImportTaxed = products.stream().mapToDouble(Product::importTaxPlusTax).reduce(0, Double::sum);
                    double total = priceTaxed + priceImportTaxed;
                    System.out.println("Sales Taxes: " + total);
                    System.out.println("Total: "+ (priceTaxed + price));

            }


    }

//    double total = 0;
//        double amountTaxes = 0;
//        for (Product product : products){
//            switch (product.isImported){
//                case 1:
//                    System.out.printf("%d - imported %s: %.2f\n", product.getAmount(), product.getProductName(), product.testImport());
//                    amountTaxes += product.amountTaxes();
//                    total += product.testImport() * product.getAmount();
//                    break;
//                case 2:
//                    System.out.printf("%d - %s: %.2f\n", product.getAmount(), product.getProductName(), product.getPrice());
//                    total += product.getPrice() * product.getAmount();
//                    break;
//                default:
//                    System.out.println("Enter a valid number");
//                    break;
//            }
//        }
//        System.out.printf("Sales Taxes: %.2f\n", amountTaxes);
//        System.out.printf("Total: %.2f", total);
//        }
