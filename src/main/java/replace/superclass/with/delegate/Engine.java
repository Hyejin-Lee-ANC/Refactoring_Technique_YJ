package replace.superclass.with.delegate;

class Engine {
    //…
    private double fuel;
    private double CV;

    Engine(double fuel, double CV) {
        this.fuel = fuel;
        this.CV = CV;
    }

    public double getFuel() {
        return fuel;
    }
    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
    public double getCV() {
        return CV;
    }
    public void setCV(double cv) {
        this.CV = cv;
    }
}
