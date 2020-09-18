package remove.flag.argument;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    Order order;

    @BeforeEach
    void setUp() {
        order = new Order();
        order.price = 1000;
    }

    @Test
    public void testFixedDiscount() {
        order.applyDiscount(Order.FIXED_DISCOUNT, 10);
        assertEquals(990, order.price);
    }

    @Test
    public void testPercentDiscount() {
        order.applyDiscount(Order.PERCENT_DISCOUNT, 0.8);
        assertEquals(800, order.price);
    }
}