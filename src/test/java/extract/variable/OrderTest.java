package extract.variable;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    Order order;
    @BeforeEach
    public void setUp() {
        order = new Order();
    }

    @Test
    public void testPrice() {
        order.quantity = 10;
        order.itemPrice = 10;
        assertEquals(110.0, order.getPrice());
    }

    @Test
    public void testPrice_discount() {
        order.quantity = 600;
        order.itemPrice = 1;
        assertEquals(655.0, order.getPrice());
    }

    @Test
    public void testPrice_overShippingCost() {
        order.quantity = 1;
        order.itemPrice = 10000;
        assertEquals(10100, order.getPrice());
    }

    @Test
    public void testPrice_discount_overShippingCost() {
        order.quantity = 10000;
        order.itemPrice = 1;
        assertEquals(9625, order.getPrice());
    }
}