import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner product = new Scanner(System.in);
        Product x;
        x = new Product();
        System.out.println("Welcome to RayMarket!");
        System.out.println("How can I help you?");
        System.out.println("Enter the number representing the product you would like to buy: ");
        System.out.println(" 1 - Food \n 2 - Book \n 3 - Medical products \n 4 - Other \n 0 - Cancel");

        int option = product.nextInt();

        while(option != 0){

            if(option == 1){
                product.nextLine();
                System.out.println("What is the product would you like to buy?");
                String productName = product.nextLine();
                System.out.println("How many products do you want?");
                x.amount = product.nextDouble();
                System.out.println("How much is that product?");
                x.price = product.nextDouble();
                System.out.println("Is the product imported?");
                System.out.println("Enter: \n 1 - Yes \n 2 - No");
                x.isImported = product.nextInt();
                if(x.isImported == 1){
                    System.out.println(x.importTax());
                }else if(x.isImported == 2){
                    System.out.println(x.price);
                }else{
                    System.out.println("Enter a validate number");
                }

            }
            else if(option == 2){
                product.nextLine();
                System.out.println("What is the product would you like to buy?");
                String productName = product.nextLine();
                System.out.println("How many products do you want?");
                x.amount = product.nextDouble();
                System.out.println("How much is that product?");
                x.price = product.nextDouble();
                System.out.println("Is the product imported?");
                System.out.println("Enter: \n 1 - Yes \n 2 - No");
                x.isImported = product.nextInt();
                if(x.isImported == 1){
                    System.out.println(x.importTax());
                }else if(x.isImported == 2){
                    System.out.println(x.price);
                }else{
                    System.out.println("Enter a validate number");
                }

            }
            else if(option == 3){
                product.nextLine();
                product.nextLine();
                System.out.println("What is the product would you like to buy?");
                String productName = product.nextLine();
                System.out.println("How many products do you want?");
                x.amount = product.nextDouble();
                System.out.println("How much is that product?");
                x.price = product.nextDouble();
                System.out.println("Is the product imported?");
                System.out.println("Enter: \n 1 - Yes \n 2 - No");
                x.isImported = product.nextInt();
                if(x.isImported == 1){
                    System.out.println(x.importTax());
                }else if(x.isImported == 2){
                    System.out.println(x.price);
                }else{
                    System.out.println("Enter a validate number");
                }

            }
           else if(option == 4){
                product.nextLine();
                System.out.println("What is the product would you like to buy?");
                String productName = product.nextLine();
                System.out.println("How many products do you want?");
                x.amount = product.nextDouble();
                System.out.println("How much is that product?");
                x.price = product.nextDouble();
                System.out.println("Is the product imported?");
                System.out.println("Enter: \n 1 - Yes \n 2 - No");
                x.isImported = product.nextInt();
                if(x.isImported == 1){
                    System.out.println(x.importTax());
                }else if(x.isImported == 2){
                    System.out.println(x.price);
                }else{
                    System.out.println("Enter a validate number");
                }

            }
           else{
                System.out.println("Enter a validate number");
            }
            System.out.println("Enter the number representing the product you would like to buy: ");
            System.out.println(" 1 - Food \n 2 - Book \n 3 - Medical products \n 4 - Other \n 0 - Cancel");
            option = product.nextInt();
        }


    }
}