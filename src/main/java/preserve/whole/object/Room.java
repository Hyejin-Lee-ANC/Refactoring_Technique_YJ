package preserve.whole.object;

class Room {
    private TempRange daysTempRange = new TempRange();

    public boolean withinPlan(HeatingPlan plan) {
        int low = daysTempRange.getLow();
        int high = daysTempRange.getHigh();
        return plan.withinRange(low, high);
    }

    void setTempRange(int low, int high) {
        daysTempRange.set(low, high);
    }
}