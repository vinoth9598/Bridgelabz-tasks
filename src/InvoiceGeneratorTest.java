
import org.junit.jupiter.api.Test ;
import static org.junit.jupiter.api.Assertions.assertEquals ;
public class InvoiceGeneratorTest {

    @Test
    void givenMultipleRides_ShouldReturnAggregationTotalFare(){
        RideRepository rideRepository = new RideRepository();
        Invoice_Generator invoiceGen = new Invoice_Generator();

        String userId = "user1";
        Ride[] rides = {
                new Ride(2.0, 5, RideType.NORMAL),
                new Ride(0.1, 1, RideType.NORMAL),
        };

        rideRepository.addRides(userId, rides);

        InvoiceSummary summary = invoiceGen.calculateInvoiceSummary(rides);


        assertEquals(30, summary.totalFare);
        assertEquals(2, summary.totalRides);
        assertEquals(15, summary.averageFare);

    }

    @Test
    void givenNormalRides(){
        Invoice_Generator invoiceGen = new Invoice_Generator();

        double fare = invoiceGen.calculateFareDifferent(
                new Ride(2.0, 5, RideType.NORMAL)
        );

        assertEquals(25, fare);
    }

    @Test
    void givenPremiumRides(){
        Invoice_Generator invoiceGen = new Invoice_Generator();

        double fare = invoiceGen.calculateFareDifferent(
                new Ride (0.5, 2, RideType.PREMIUM)
        );

        assertEquals(20, fare);
    }

}
