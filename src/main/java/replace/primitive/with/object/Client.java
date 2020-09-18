package replace.primitive.with.object;

import java.util.Collection;
import java.util.Iterator;

public class Client {
    // Client code, which uses Order class.
    static int numberOfOrdersFor(Collection orders, String customer) {
        int result = 0;
        Iterator iter = orders.iterator();
        while (iter.hasNext()) {
            Order each = (Order) iter.next();
            if (each.getCustomer().equals(customer)) {
                result++;
            }
        }
        return result;
    }
}
