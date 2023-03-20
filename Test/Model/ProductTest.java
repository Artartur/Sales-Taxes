package Model;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ProductTest {
    @Test
    public void testTax() {
        Product product = new Product();
        product.setPrice(10.00);
        product.setAmount(2);
        product.tax();
        assertEquals(22.00, product.getFinalPrice(), 0.001);
    }

    @Test
    public void testImportTax() {
        Product product = new Product();
        product.setPrice(10.00);
        product.setAmount(2);
        product.setIsImported(1);
        product.importTax();
        assertEquals(21.00, product.getFinalPrice(), 0.001);
    }

    @Test
    public void testImportTaxPlusTax() {
        Product product = new Product();
        product.setPrice(10.00);
        product.setAmount(2);
        product.setIsImported(1);
        product.importTaxPlusTax();
        assertEquals(23.00, product.getFinalPrice(), 0.001);
    }

    @Test
    public void testRoundValues() {
        double value = 10.123;
        assertEquals(10.12, Product.roundValues(value), 0.001);
    }

    @Test
    public void testToString() {
        Product product = new Product();
        product.setAmount(2);
        product.setProductName("Test Product");
        product.setFinalPrice(22.00);
        assertEquals("2 Test Product: 22.0", product.toString());
    }


}
