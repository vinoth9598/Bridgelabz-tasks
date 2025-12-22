public class InvoiceService {

    private final RideRepository rideRepository ;
    private final Invoice_Generator invoiceGenerator ;

    public InvoiceService(RideRepository rideRepository){
        this.rideRepository = rideRepository ;
        this.invoiceGenerator =new Invoice_Generator();
    }

    public InvoiceSummary getInvoiceSummary(String userId) {
        Ride[] rides = rideRepository.getRides(userId);
        return invoiceGenerator.calculateInvoiceSummary(rides);
    }
}
