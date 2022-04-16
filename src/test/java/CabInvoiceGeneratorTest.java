import junit.framework.TestCase;
import org.junit.Assert;

public class CabInvoiceGeneratorTest extends TestCase {
    public void testInvoiceGenerator() {
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        double actual = cabInvoiceGenerator.invoiceGenerator(2,5);
        Assert.assertEquals(25,actual,0);
    }

    public void testMultipleInvoiceGenerator() {
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        Rides[] rides = { new Rides(2.0,5),
                new Rides(0.1,1)};
        double acutal = cabInvoiceGenerator.multipleInvoiceGenerator(rides);
        assertEquals(2,acutal,0);
    }

//    public void testMain() {
//        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
//        double actual = cabInvoiceGenerator.invoiceGenerator(CabInvoiceGenerator.distance,CabInvoiceGenerator.time);
//        Assert.assertEquals(,actual);
//    }
}