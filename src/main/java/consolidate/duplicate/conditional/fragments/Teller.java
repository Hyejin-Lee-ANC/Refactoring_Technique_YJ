package consolidate.duplicate.conditional.fragments;

public class Teller {
    double total;
    double price;
    boolean isSpecialDeal;

    void sendEmailPromotion() {
        if (isSpecialDeal()) {
            total = price * 0.95;
            validateEmailAddress();
            sendEmail();
        }
        else {
            validateEmailAddress();
            total = price * 0.98;
            sendEmail();
        }
    }

    boolean isSpecialDeal() {
        return isSpecialDeal;
    }

    void validateEmailAddress() {
        // do something.
    }

    void sendEmail() {
        // do something with total.
    }
}
