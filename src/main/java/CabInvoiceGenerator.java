public class CabInvoiceGenerator {
    static final double COST_PER_KILOMETER = 10;
    static final double COST_PER_MINUTE = 1;
    public static void main(String[] args) {
        double distance = 2;
        double time = 5;
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        System.out.println(cabInvoiceGenerator.invoiceGenerator(distance,time));
    }

    private double invoiceGenerator(double distance, double time) {
        double fare = COST_PER_KILOMETER * distance + time * COST_PER_MINUTE;
        return fare;
    }

}
