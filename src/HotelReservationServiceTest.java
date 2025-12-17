
import static org.junit.jupiter.api.Assertions.assertEquals ;
import org.junit.jupiter.api.Test ;
public class HotelReservationServiceTest {

//    @Test
//    void givenHotelDetails_WhenAdded_ShouldReturnHotelCountOne() {
//        HotelReservationService service = new HotelReservationService();
//
//        service.addHotel("Lakewood", 110);
//
//        assertEquals(1, service.getHotels().size());
//        assertEquals("Lakewood", service.getHotels().get(0).getName());
//        assertEquals(110, service.getHotels().get(0).getRegularRate());
//    }
//
//    @Test
//    void givenDateRange_ShouldReturnCheapestHotel() {
//
//        HotelReservationService service = new HotelReservationService();
//
//        service.addHotel("Lakewood", 110);
//        service.addHotel("Bridgewood", 160);
//        service.addHotel("Ridgewood", 220);
//
//        Hotel cheapestHotel =
//                service.findCheapestHotel("10Sep2020", "11Sep2020");
//
//        int days = service.getNumberOfDays("10Sep2020", "11Sep2020");
//        int totalRate = service.calculateTotalRate(cheapestHotel, days);
//
//        assertEquals("Lakewood", cheapestHotel.getName());
//        assertEquals(220, totalRate);
//    }

    @Test
    void givenHotelWithWeekdayAndWeekendRates_ShouldBeAddedCorrectly() {

        HotelReservationService service = new HotelReservationService();

        service.addHotel("Lakewood", 110, 90, 50);
        service.addHotel("Bridgewood", 150, 50,150);
        service.addHotel("Ridgewood", 220, 150, 220);

        assertEquals(3, service.getHotels().size());

        Hotel lakewood = service.getHotels().get(0);
        assertEquals("Lakewood", lakewood.getName());
        assertEquals(110, lakewood.getWeekdayRate());
        assertEquals(90, lakewood.getWeekendRate());
    }

}
