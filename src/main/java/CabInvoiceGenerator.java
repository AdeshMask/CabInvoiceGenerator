import java.util.Scanner;

public class CabInvoiceGenerator {
    static final double COST_PER_KILOMETER = 10;
    static final double COST_PER_MINUTE = 1;
    static Scanner scanner = new Scanner(System.in);
    static double distance;
    static double time;
    static double result;

    public static void main(String[] args) {
//        double distance = 2;
//        double time = 5;
        System.out.println("Enter number of rides:");
        int rides = scanner.nextInt();
        for (int i = 1;i <= rides; i++){
            System.out.print("Enter distanc fot "+ i+" Ride");
            distance = scanner.nextDouble();
            System.out.print("Enter Time");
            time = scanner.nextDouble();
            CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
            result = result + cabInvoiceGenerator.invoiceGenerator(distance,time);
        }
        double aggrigate = result / rides;
        System.out.println("Aggrigate: "+aggrigate);
    }

    private double invoiceGenerator(double distance, double time) {
        double fare = COST_PER_KILOMETER * distance + time * COST_PER_MINUTE;
        return fare;
    }

}
