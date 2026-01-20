
public class Person {

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zip;
    private String phoneNumber;

    public Person(String firstName, String lastName, String address,
                  String city, String state, int zip, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "First Name='" + firstName + '\'' +
                ", Last Name='" + lastName + '\'' +
                ", Address='" + address + '\'' +
                ", City='" + city + '\'' +
                ", State='" + state + '\'' +
                ", Zip=" + zip +
                ", Phone='" + phoneNumber + '\'' +
                '}';
    }
}
