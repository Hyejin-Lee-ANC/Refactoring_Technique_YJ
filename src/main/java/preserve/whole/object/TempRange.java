package preserve.whole.object;

public class TempRange {
    int low;
    int high;

    int getLow() {
        return low;
    }

    int getHigh() {
        return high;
    }

    public void set(int low, int high) {
        this.low = low;
        this.high = high;
    }
}
