package move.function;

class Account {
    private AccountType type;
    private int daysOverdrawn;

    public double overdraftCharge() {
        if (type.isPremium()) {
            double result = 10;
            if (daysOverdrawn > 7) {
                result += (daysOverdrawn - 7) * 0.85;
            }
            return result;
        }
        else {
            return daysOverdrawn * 1.75;
        }
    }
    public double bankCharge() {
        double result = 4.5;
        if (daysOverdrawn > 0) {
            result += overdraftCharge();
        }
        return result;
    }

    void setDaysOverdrawn(int days) {
        daysOverdrawn = days;
    }

    void setType(AccountType type) {
        this.type = type;
    }
}
