package Controller;

import Model.Product;
import Controller.ExemptProducts;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class ExemptProductsTest {
    @Test
    public void testBuyExemptProductsImported() {
        String input = "book\n10\n1\n1\n";
        Scanner scanner = new Scanner(input);
        Product product = ExemptProducts.BuyExemptProducts(scanner);
        assertEquals("book", product.getProductName());
        assertEquals(10, product.getPrice(),0.001);
        assertEquals(10.5, product.getFinalPrice(),0.001);
        assertEquals(1, product.getAmount());
        assertEquals(Product.ProductType.IMPORTED, product.getProductType());
    }

}
