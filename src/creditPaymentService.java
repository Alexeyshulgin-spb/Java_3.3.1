public class creditPaymentService {
    public int calculate(double ratePercent, int periodYear, int sumInRubles) {
        double calcPercent = (ratePercent / 100 / 12);
        int result = (int) ((int) sumInRubles * ((calcPercent * Math.pow((1 + calcPercent), 12 * periodYear)) / (Math.pow((1 + calcPercent), 12 * periodYear) - 1)));
        return result;
    }
}