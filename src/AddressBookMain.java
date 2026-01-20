

import java.util.Scanner;
import java.util.* ;

public class AddressBookMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        AddressBookService service = new AddressBookService();
        boolean continueAdding = true ;

        while(continueAdding){
            System.out.println("\nEnter First Name:");
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

            System.out.println("\nDo you want to add another person? (yes/no)");
            String choice = scanner.nextLine();

            if (!choice.equalsIgnoreCase("yes")) {
                continueAdding = false;
            }
        }
        System.out.println("\n----- Address Book -----");
        service.getAllPersons().forEach(System.out::println);

        scanner.close();
    }
}
