
import java.util.*;
import java.util.stream.Collectors;

public class AddressBookMain {

    public static void main(String[] args){
        List <Contact> addressBook = new ArrayList<>();

        addressBook.add(new Contact("Vino", "Dev", "Chennai", "TN", 9876543210L));
        addressBook.add(new Contact("Arun", "Kumar", "Bangalore", "KA", 9123456780L));
        addressBook.add(new Contact("Priya", "Sharma", "Chennai", "TN", 9988776655L));
        addressBook.add(new Contact("Ravi", "Singh", "Delhi", "DL", 9090909090L));

//        Display all Contacts
        System.out.println("All Contacts:");
        addressBook.stream().forEach(System.out::println);

//       Search person by city
        System.out.println("\nContacts from chennai");
        addressBook.stream()
                .filter(c -> c.getCity().equalsIgnoreCase("Chennai"))
                .forEach(System.out::println);

//        Search person by state
        System.out.println("\nContacts from TN");
        addressBook.stream()
                .filter(t -> t.getState().equalsIgnoreCase("TN"))
                .forEach(System.out::println);

//        Sort contacts by first Name
        System.out.println("\nSorted by First Name");
        addressBook.stream()
                .sorted(Comparator.comparing(Contact::getFirstName))
                .forEach(System.out::println);

//      count contacts by city
        Map <String, Long> countByCity = addressBook.stream()
                .collect(Collectors.groupingBy(
                        Contact::getCity,
                        Collectors.counting()
                ));

        System.out.println("\nCount by City :");
        countByCity.forEach((city, count)->{
            System.out.println(city + " : " + count);
        });
    }
}

class Contact {
    private String firstName ;
    private String lastName ;
    private String city ;
    private String state ;
    private long mobile ;


    public Contact(String firstName, String lastName, String city, String state, long mobile) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
        this.mobile = mobile;
    }

    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public String getCity() {return city;}
    public String getState() {return state;}
    public long getMobile() {return mobile;}

    @Override
    public String toString(){
        return firstName + " " + lastName + " " + city + " " + state + " " + mobile;
    }

}
