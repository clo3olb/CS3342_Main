import java.util.Date;

interface Pay {
    public Payment requestPayment();

    public void refund(Payment payment);
}

class SamsungPay implements Pay {
    @Override
    public Payment requestPayment() {
        // request payment with SamsungPay
        return null;
    }

    @Override
    public void refund(Payment payment) {
        // refund
    }
}

class ApplePay implements Pay {
    @Override
    public Payment requestPayment() {
        // request payment with ApplePay
        return null;
    }

    @Override
    public void refund(Payment payment) {
        // refund
    }
}

class Payment {
    private Date timestamp;
    private double amount;
    private Pay paymentMethod;

    Payment(Date timestamp, double amount, Pay paymentMethod) {
        this.timestamp = timestamp;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }
}

public class PayService {
    public void requestPayment(Pay pay) {
        // request payment with assigned payment method.
        pay.requestPayment();
    }

    public void refund(Pay pay, Payment payment) {
        // Process refund.
        pay.refund(payment);
    }
}
