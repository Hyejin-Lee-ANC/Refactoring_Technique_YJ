package replace.parameter.with.query;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    @Test
    public void testDiscountLevel_one() {
        Order order = new Order();
        order.itemPrice = 10;
        order.quantity = 3;
        assertEquals(1.5, order.getPrice());
    }

    @Test
    public void testDiscountLevel_two() {
        Order order = new Order();
        order.itemPrice = 150;
        order.quantity = 1;
        assertEquals(7.5, order.getPrice());
    }
}