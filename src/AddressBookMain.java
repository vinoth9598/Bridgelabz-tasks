

import java.util.Scanner;
import java.util.* ;

public class AddressBookMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();

        // Sample Data
        personList.add(new Person("Vinoth", "Kumar", "MG Road",
                "Chennai", "Tamil Nadu", 600001, "9876543210"));
        personList.add(new Person("Rahul", "Sharma", "Park Street",
                "Bangalore", "Karnataka", 560001, "9123456789"));
        personList.add(new Person("Anita", "Verma", "Link Road",
                "Mumbai", "Maharashtra", 400001, "9988776655"));

        AddressBookService service = new AddressBookService(personList);

        System.out.println("1. View Persons by City");
        System.out.println("2. View Persons by State");
        int choice = scanner.nextInt();
        scanner.nextLine(); // clear buffer

        switch (choice) {
            case 1:
                System.out.println("Enter City:");
                String city = scanner.nextLine();

                System.out.println("\nPersons in City: " + city);
                service.viewPersonsInCity(city)
                        .forEach(System.out::println);
                break;

            case 2:
                System.out.println("Enter State:");
                String state = scanner.nextLine();

                System.out.println("\nPersons in State: " + state);
                service.viewPersonsInState(state)
                        .forEach(System.out::println);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        // Optional: Print full dictionaries
        System.out.println("\n--- City Dictionary ---");
        for (Map.Entry<String, List<Person>> entry : service.getPersonsByCity().entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\n--- State Dictionary ---");
        for (Map.Entry<String, List<Person>> entry : service.getPersonsByState().entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        scanner.close();
    }
}
