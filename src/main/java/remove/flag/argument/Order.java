package remove.flag.argument;

class Order {
    public static final int FIXED_DISCOUNT = 0;
    public static final int PERCENT_DISCOUNT = 1;

    double price;

    public void applyDiscount(int type, double discount) {
        switch (type) {
            case FIXED_DISCOUNT:
                price -= discount;
                break;
            case PERCENT_DISCOUNT:
                price *= discount;
                break;
            default:
                throw new IllegalArgumentException("Invalid discount type");
        }
    }
}
