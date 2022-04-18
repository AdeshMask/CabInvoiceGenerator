public class InvoiceGenerator {
    int costPerKm = 10;
    int costPerMin = 1;
    int minFare = 5;
    double totalFare = 0;
    double averageFarePerRide = 0;

    //Calculating total fare....
    public double invoiceGenerator(double distance, double time) {
        totalFare = distance * costPerKm + time * costPerMin;
        if (totalFare < minFare) {
            return minFare;
        } else {
            return totalFare;
        }
    }

    //Multiple Ride...
    public double multipleInvoiceGenerator(Rides[] rides) {
        totalFare = 0.0;
        for (Rides ride : rides) {
            totalFare = totalFare + invoiceGenerator(ride.distance, ride.time);
        }
        System.out.print("Total Fare is: ");
        return totalFare;
    }

    //Invoice summary...
    public InvoiceSummary invoiceSummary(Rides[] rides) {
        totalFare = 0.0;
        for (Rides ride : rides) {
            totalFare = totalFare + invoiceGenerator(ride.distance, ride.time);
        }
        //    System.out.println(rides.length);
        return new InvoiceSummary(rides.length, totalFare);
    }
}
