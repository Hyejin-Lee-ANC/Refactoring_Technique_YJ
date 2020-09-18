package replace.superclass.with.delegate;

class Car extends Engine {
    private String brand;
    private String model;

    Car(String brand, String model, double fuel, double CV) {
        super(fuel, CV);
        this.brand = brand;
        this.model = model;
    }

    public String getName() {
        return brand + " " + model + " (" + getCV() + "CV)";
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
}