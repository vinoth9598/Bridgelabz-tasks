

import java.util.Scanner;
import java.util.* ;

public class AddressBookMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();
        AddressBookService service = new AddressBookService(personList);

        System.out.println("Enter First Name:");
        String firstName = scanner.nextLine();

        System.out.println("Enter Last Name:");
        String lastName = scanner.nextLine();

        System.out.println("Enter Address:");
        String address = scanner.nextLine();

        System.out.println("Enter City:");
        String city = scanner.nextLine();

        System.out.println("Enter State:");
        String state = scanner.nextLine();

        System.out.println("Enter Zip:");
        int zip = scanner.nextInt();

        scanner.nextLine(); // clear buffer

        System.out.println("Enter Phone Number:");
        String phoneNumber = scanner.nextLine();

        boolean isUpdated = service.editPerson(
                firstName, lastName,
                address, city, state,
                zip, phoneNumber
        );
        if (isUpdated) {
            System.out.println("\nPerson details updated successfully!");
        } else {
            System.out.println("\nPerson not found!");
        }

        System.out.println("\n----- Updated Address Book -----");
        service.getAllPersons().forEach(System.out::println);

        scanner.close();
    }
}
