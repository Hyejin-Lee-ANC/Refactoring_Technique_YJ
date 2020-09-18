package preserve.whole.object;

class HeatingPlan {
    private TempRange range = new TempRange();

    void setTempRange(int low, int high) {
        range.set(low, high);
    }

    public boolean withinRange(int low, int high) {
        return (low >= range.getLow() && high <= range.getHigh());
    }
}
