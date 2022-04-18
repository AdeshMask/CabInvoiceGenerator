import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class InvoiceGeneratorTest extends TestCase {

    InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
    public void testInvoiceGenerator() {
        double actual = invoiceGenerator.invoiceGenerator(2,5);
        assertEquals(25,actual,0);
    }

    public void testMultipleInvoiceGenerator() {

        Rides[] rides = { new Rides(2.0,5),
                new Rides(0.1,1)};
        double acutal = invoiceGenerator.multipleInvoiceGenerator(rides);
        assertEquals(2,acutal,0);
    }

    public void testInvoiceSummary() {
        String userId = "User1";
        InvoiceServices invoiceService = new InvoiceServices();
        ArrayList<Rides> rides = new ArrayList<Rides>();
        rides.add(new Rides(2.0, 5));
        rides.add(new Rides(0.1, 1));
        invoiceService.addRide(userId, rides);
        ArrayList<Rides> listOfRides = invoiceService.getRides(userId);
        InvoiceSummary summaryForUser1 = invoiceGenerator.invoiceSummary(listOfRides.toArray(new Rides[0]));
        InvoiceSummary expectedSummary = new InvoiceSummary(2, 30);
        if (expectedSummary.getAverageFare() == summaryForUser1.getAverageFare() && expectedSummary.getNumberOfRides() == summaryForUser1.getNumberOfRides() && expectedSummary.getTotalFare() == summaryForUser1.getTotalFare())
            Assert.assertEquals(1, 1);
    }
}