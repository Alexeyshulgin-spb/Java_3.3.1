public class Main {
    public static void main(String[] args) {
        creditPaymentService service = new creditPaymentService();
        double ratePercent = 9.99;
        int periodYear = 1;
        int sumInRubles = 1_000_000;
        int annuit = service.calculate(ratePercent, periodYear, sumInRubles);

        System.out.println(annuit + (" рублей"));

        System.out.println();
        System.out.println(service.calculate(ratePercent, periodYear = 2, sumInRubles) + (" рублей "));

        System.out.println();
        System.out.println(service.calculate(ratePercent, periodYear = 3, sumInRubles) + (" рублей "));


    }
}