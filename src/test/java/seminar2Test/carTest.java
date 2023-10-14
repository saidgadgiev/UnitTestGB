package seminar2Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seminar2.Cart;
import seminar2.Product;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class carTest {
    private Cart cart;
    private Product product1;
    private Product product2;

    @BeforeEach
    public void  setUp() {
        cart = new Cart();
        product1 = new Product(1, "apple", 1.2, 10);
        product2 = new Product(2, "banan", 1.8, 3);
    }

    @Test
    public void calculateTotalTest() {
        cart.addItem(product1);
        cart.addItem(product2);
        double expectedTotal = 17.4;
        double actualTotal = cart.calculateTotal();
        assertEquals(expectedTotal, actualTotal,  "Стоимость корзины не корректно");
    }

}
