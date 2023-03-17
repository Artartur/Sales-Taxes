import Options.buyFood;
import Options.buyBook;
import Options.buyMedical;
import Options.buyOther;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        buyFood foodInstance = new buyFood();
        buyBook bookInstance= new buyBook();
        buyMedical medicalInstance = new buyMedical();
        buyOther otherInstance = new buyOther();
        System.out.println("Welcome to RayMarket!");
        System.out.println("How can I help you?");
        System.out.println("Enter the number representing the product you would like to buy: ");
        System.out.println(" 1 - Food \n 2 - Book \n 3 - Medical products \n 4 - Other \n 0 - Cancel");

        int option = inputScanner.nextInt();

        while(option != 0) {

            switch (option) {
                case 1:
                    foodInstance.buyFood(inputScanner);
                    break;
                case 2:
                    bookInstance.buyBook(inputScanner);
                    break;
                case 3:
                    medicalInstance.buyMedical(inputScanner);
                    break;
                case 4:
                    otherInstance.buyOther(inputScanner);
                    break;
                default:
                    System.out.println("Please, enter a valid number");
            }

            System.out.println("Enter the number representing the product you would like to buy: ");
            System.out.println(" 1 - Food \n 2 - Book \n 3 - Medical products \n 4 - Other \n 0 - Cancel");
            option = inputScanner.nextInt();
        }


    }
}