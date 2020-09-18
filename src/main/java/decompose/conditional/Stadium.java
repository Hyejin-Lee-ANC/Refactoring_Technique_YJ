package decompose.conditional;

import java.util.Date;

class Stadium {
    public static final int YEAR = 2020;
    public static final Date WINTER_START = new Date(YEAR, 11, 1);
    public static final Date WINTER_END = new Date(YEAR + 1, 2, 1);
    // ...
    public double summerRate;
    public double winterRate;
    public double winterServiceCharge;

    public double getTicketPrice(Date date, int quantity) {
        double charge;
        if (date.before(WINTER_START) || date.after(WINTER_END)) {
            charge = quantity * summerRate;
        }
        else {
            charge = quantity * winterRate + winterServiceCharge;
        }
        return charge;
    }
}
