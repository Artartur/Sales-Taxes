package Controller.ProductOptions;
import Model.Product;
import Model.Products.Books;
import java.util.Scanner;

public class BuyBook {
    public static Product buyBook(Scanner scanner){
        Product book = new Product();

        System.out.println("Which is the product would you like to buy? \n 1 - Harry Potter \n 2 - Lord of the Rings \n 3 - Game of Thrones");
        int bookOption = scanner.nextInt();
        switch (bookOption) {
            case 1:
                book.setProductName(Books.HARRY_POTTER.getProductName());
                book.setPrice(Books.HARRY_POTTER.getPrice());
                break;
            case 2:
                book.setProductName(Books.LORD_OF_THE_RINGS.getProductName());
                book.setPrice(Books.LORD_OF_THE_RINGS.getPrice());
                break;
            case 3:
                book.setProductName(Books.GAME_OF_THRONES.getProductName());
                book.setPrice(Books.GAME_OF_THRONES.getPrice());
                break;
            default:
                System.out.println("Enter a validate number");
                break;
        }
        System.out.println("How many " + book.getProductName()+ " do you want?");
        book.setAmount(scanner.nextInt());
        System.out.println("Is the product imported?");
        System.out.println("Enter: \n 1 - Yes \n 2 - No");
        book.isImported = scanner.nextInt();
        if (book.isImported == 1) {
            System.out.println(book.importTax());
        } else if (book.isImported == 2) {
            System.out.println(book.getPrice());
        } else {
            System.out.println("Enter a valid number");
        }

        return book;
    }
}
