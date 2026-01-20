

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        AddressBookService service = new AddressBookService();

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

        System.out.println("\n----- Address Book -----");
        service.getPersonList().forEach(System.out::println);

        scanner.close();
    }
}
