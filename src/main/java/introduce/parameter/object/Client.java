package introduce.parameter.object;

import java.util.Date;

public class Client {
    // Somewhere in client code…
    Account account = new Account();

    void drawFlowChartBetween(Date startDate, Date endDate) {
        double flow = account.getFlowBetween(startDate, endDate);
        // ...
    }
}
