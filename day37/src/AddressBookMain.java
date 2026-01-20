
import java.util.Scanner ;
public class AddressBookMain {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        AddressBookService service = new AddressBookService();

        System.out.println("Enter first Name :");
        String firstName = sc.nextLine();

        System.out.println("Enter Last Name :");
        String lastName = sc.nextLine();

        System.out.println("Enter address :");
        String address = sc.nextLine();

        System.out.println("Enter city :");
        String city = sc.nextLine();

        System.out.println("Enter state");
        String state = sc.nextLine();

        System.out.println("Enter Zip :");
        String zip = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter Phone number :");
        String phoneNumber = sc.nextLine();

        Person person = new Person(
                firstName,
                lastName,
                address,
                city,
                state,
                zip,
                phoneNumber
        );

        service.addPerson(person);

        boolean isUpdated = service.editPerson(
                firstName,lastName,address,
                city,state,zip,phoneNumber
        );
        if(isUpdated){
            System.out.println("\nPerson details updated successfully!");
        }else {
            System.out.println("\nPerson Not Found!");
        }
        service.getPersonList().forEach(System.out::println);

        sc.close();
    }
}