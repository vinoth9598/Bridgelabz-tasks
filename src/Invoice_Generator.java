public class Invoice_Generator {
    public static final double Cost_Per_Km = 10;
    public static final double Cost_Per_Minute = 1 ;
    public static final double Min_Fare = 5;

//    public static void main(String[] args){
//
//        System.out.println("Invoice generator first calculate Fare");
//
//        double distance = 2.0 ;
//        int time = 5 ;
//        double result = calculateFare(distance, time);
//
//        System.out.println ("Fare :" + result);
//
//    }

    public double calculateFare(double distance, int time){
        double totalFare = (distance * Cost_Per_Km) + (time * Cost_Per_Minute);
        return Math.max(totalFare, Min_Fare);
    }

    public double calculateFareDifferent(Ride ride){
        double fare ;

        if(ride.rideType == RideType.NORMAL){
            fare = (ride.distance * 10) + (ride.time * 1);
            return Math.max(fare, 5);
        }else {
            fare = (ride.distance * 15) + (ride.time * 2);
            return Math.max(fare, 20);
        }
    }

    public InvoiceSummary calculateInvoiceSummary(Ride[] rides){
        double totalFare = 0;

        for(Ride ride : rides){
            totalFare += calculateFare(ride.distance, ride.time);
        }
        return new InvoiceSummary(rides.length, totalFare);
    }
}
