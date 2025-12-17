import java.time.format.DateTimeFormatter;
import java.util.ArrayList ;
import java.util.List ;
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.stream.*;
import java.util.Comparator;
import java.time.format.DateTimeParseException;
import java.util.regex.Pattern;

public class HotelReservationService {

    private final List<Hotel> hotelList = new ArrayList<>();

    private static final Pattern DATE_PATTERN =
            Pattern.compile("\\d{2}[A-Za-z]{3}\\d{4}");

    private static final Pattern CUSTOMER_PATTERN =
            Pattern.compile("REWARD|REGULAR", Pattern.CASE_INSENSITIVE);

    public void addHotel(String name, int regularRate,int weekendRate,int weekdayRate,int rating) {
        Hotel hotel = new Hotel(name, regularRate,  weekendRate, weekdayRate, rating);
        hotelList.add(hotel);
    }

    public List<Hotel> getHotels() {
        return hotelList;
    }

    public int getNumberOfDays(String startDate, String endDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMMyyyy");
        LocalDate start = LocalDate.parse(startDate, formatter);
        LocalDate end = LocalDate.parse(endDate, formatter);
        return (int) (end.toEpochDay() - start.toEpochDay() + 1);
    }

    public List<Hotel> findCheapestHotels(String startDate, String endDate) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMMyyyy");
        LocalDate start = LocalDate.parse(startDate, formatter);
        LocalDate end = LocalDate.parse(endDate, formatter);

        int minRate = Integer.MAX_VALUE;
        List<Hotel> cheapestHotels = new ArrayList<>();

        for (Hotel hotel : hotelList) {
            int totalRate = 0;
            LocalDate date = start;

            while (!date.isAfter(end)) {
                DayOfWeek day = date.getDayOfWeek();
                if (day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY) {
                    totalRate += hotel.getWeekendRate();
                } else {
                    totalRate += hotel.getWeekdayRate();
                }
                date = date.plusDays(1);
            }

            if (totalRate < minRate) {
                minRate = totalRate;
                cheapestHotels.clear();
                cheapestHotels.add(hotel);
            } else if (totalRate == minRate) {
                cheapestHotels.add(hotel);
            }
        }
        return cheapestHotels;
    }

    public Hotel findCheapestBestRatedHotel(String startDate, String endDate) {

        int cheapestRate = hotelList.stream()
                .mapToInt(h -> calculateTotalRate(h, startDate, endDate))
                .min()
                .orElse(Integer.MAX_VALUE);

        return hotelList.stream()
                .filter(h -> calculateTotalRate(h, startDate, endDate) == cheapestRate)
                .max(Comparator.comparingInt(Hotel::getRating))
                .orElse(null);
    }

    public Hotel findBestRatedHotel(String startDate, String endDate) {
        return hotelList.stream()
                .max(Comparator.comparingInt(Hotel::getRating))
                .orElse(null);
    }

    public int calculateTotalRate(Hotel hotel, String startDate, String endDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMMyyyy");
        LocalDate start = LocalDate.parse(startDate, formatter);
        LocalDate end = LocalDate.parse(endDate, formatter);

        int total = 0;
        while (!start.isAfter(end)) {
            DayOfWeek day = start.getDayOfWeek();
            total += (day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY)
                    ? hotel.getWeekendRate()
                    : hotel.getWeekdayRate();
            start = start.plusDays(1);
        }
        return total;
    }


    private LocalDate parseDate(String date) throws HotelReservationException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMMyyyy");
        try {
            return LocalDate.parse(date, formatter);
        } catch (DateTimeParseException e) {
            throw new HotelReservationException("Invalid Date Format: " + date);
        }
    }

    private int calculateRewardRate(Hotel hotel, LocalDate start, LocalDate end) {
        int total = 0;
        while (!start.isAfter(end)) {
            DayOfWeek day = start.getDayOfWeek();
            total += (day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY)
                    ? hotel.getRewardWeekendRate()
                    : hotel.getRewardWeekdayRate();
            start = start.plusDays(1);
        }
        return total;
    }

    public Hotel findCheapestBestRatedHotelForRewardCustomer(
            String startDate, String endDate, String customerType)
            throws HotelReservationException {

        if (!"REWARD".equalsIgnoreCase(customerType)) {
            throw new HotelReservationException("Invalid Customer Type: " + customerType);
        }

        LocalDate start = parseDate(startDate);
        LocalDate end = parseDate(endDate);

        int minRate = hotelList.stream()
                .mapToInt(h -> calculateRewardRate(h, start, end))
                .min()
                .orElse(Integer.MAX_VALUE);

        return hotelList.stream()
                .filter(h -> calculateRewardRate(h, start, end) == minRate)
                .max(Comparator.comparingInt(Hotel::getRating))
                .orElse(null);
    }

    public int getTotalRewardRate(Hotel hotel, String startDate, String endDate)
            throws HotelReservationException {
        LocalDate start = parseDate(startDate);
        LocalDate end = parseDate(endDate);
        return calculateRewardRate(hotel, start, end);
    }
}
