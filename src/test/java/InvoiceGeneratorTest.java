import junit.framework.TestCase;
import org.junit.Assert;

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
        InvoiceGenerator invoice = new InvoiceGenerator();
        Rides[] rides = { new Rides(2.0,5),
                new Rides(0.1,1)};
        InvoiceSummary summary = invoice.invoiceSummary(rides);
        InvoiceSummary expectedInvoice = new InvoiceSummary(2, 2);
        Assert.assertEquals(expectedInvoice, summary);
    }
}