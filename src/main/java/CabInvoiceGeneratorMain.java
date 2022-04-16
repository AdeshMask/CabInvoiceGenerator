import java.util.Scanner;

public class CabInvoiceGeneratorMain {
    static final double COST_PER_KILOMETER = 10;
    static final double COST_PER_MINUTE = 1;
    static Scanner scanner = new Scanner(System.in);
    static double result;
    static final double MINIMUM_FARE = 5;

    public static void main(String[] args) {
        double distance1 = 2;
        double time1 = 5;
        CabInvoiceGeneratorMain cabInvoiceGenerator = new CabInvoiceGeneratorMain();
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        System.out.println(invoiceGenerator.invoiceGenerator(distance1,time1));
        Rides[] rides = {new Rides(2.0,5),
                new Rides(0.1,1)};
        System.out.println(invoiceGenerator.multipleInvoiceGenerator(rides));
    }
}
