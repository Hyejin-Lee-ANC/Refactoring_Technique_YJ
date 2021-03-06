package replace.temp.with.query;

class Product {
    double quantity;
    double itemPrice;

    Product(double quantity, double itemPrice) {
        this.quantity = quantity;
        this.itemPrice = itemPrice;
    }

    public double getPrice() {
        double basePrice = quantity * itemPrice;
        double discountFactor;
        if (basePrice > 1000) {
            discountFactor = 0.95;
        }
        else {
            discountFactor = 0.98;
        }
        return basePrice * discountFactor;
    }
}
