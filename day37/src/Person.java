
public class Person {

    private String firstName ;
    private String lastname ;
    private String address ;
    private String city ;
    private String state ;
    private int zip ;
    private String phoneNumber ;

    public Person (String firstName, String lastname, String address,
                    String city, String state, int zip , String phoneNumber
                    ){
        this.firstName = firstName ;
        this.lastname = lastname ;
        this.address = address ;
        this.city = city ;
        this.state = state ;
        this.zip = zip ;
        this.phoneNumber = phoneNumber ;
    }

    @Override
    public String toString(){
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}