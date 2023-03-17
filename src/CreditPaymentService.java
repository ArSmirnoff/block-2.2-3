public class CreditPaymentService {
    public int calculate(double persent, int amountCredit, int creditTerm) {
        double rate = persent / 100 / 12;
        double ratio = rate + (rate / (Math.pow(1 + rate, amountCredit) - 1));
        double payment = creditTerm * ratio;
        return (int) payment;
    }
}

