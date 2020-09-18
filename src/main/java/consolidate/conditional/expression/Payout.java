package consolidate.conditional.expression;

class Payout {
    public int seniority;
    public int monthsDisabled;
    public boolean isPartTime;

    public double disabilityAmount() {
        if (seniority < 2) {
            return 0;
        }
        if (monthsDisabled > 12) {
            return 0;
        }
        if (isPartTime) {
            return 0;
        }
        // compute the disability amount
        return seniority + monthsDisabled / 3;
    }
}