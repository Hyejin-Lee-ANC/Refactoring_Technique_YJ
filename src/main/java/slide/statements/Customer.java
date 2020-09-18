package slide.statements;

import java.util.ArrayDeque;

public class Customer {
    private ArrayDeque<Order> pendingOrders = new ArrayDeque<>();

    void addOrder(Order o) {
        pendingOrders.push(o);
    }

    public Order retrievePeekOrder() {
        return pendingOrders.pop();
    }
}
