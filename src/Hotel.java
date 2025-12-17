public class Hotel {
    private String name ;
    private int regularRate ;
    private int weekdayRate ;
    private int weekendRate ;
    private int rating ;

    public Hotel(String name, int regularRate, int  weekdayRate, int weekendRate, int rating) {
        this.name = name ;
        this.regularRate = regularRate ;
        this.weekdayRate = weekdayRate ;
        this.weekendRate = weekendRate ;
        this.rating = rating ;
    }

    public String getName(){
        return name ;
    }

    public int getRegularRate(){
        return regularRate ;
    }

    public int getWeekdayRate(){
        return weekdayRate ;
    }
    public int getWeekendRate(){
        return weekendRate ;
    }

    public int getRating(){
        return rating ;
    }

    public int getRewardWeekendRate(){
        return weekendRate ;
    }

    public int getRewardWeekdayRate(){
        return weekdayRate ;
    }
}
