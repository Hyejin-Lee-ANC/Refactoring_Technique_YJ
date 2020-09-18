package move.field;

class Account {
    // ...
    private AccountType type = new AccountType();
    private double interestRate;

    public double interestForAmount_days(double amount, int days) {
        return interestRate * amount * days / 365.0;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
