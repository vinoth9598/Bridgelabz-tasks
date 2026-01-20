

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

        System.out.println("Press 1 to sort Address Book by Person Name");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("\n----- Sorted Address Book (Alphabetical Order) -----");
            service.sortByPersonName()
                    .forEach(System.out::println);
        }

        scanner.close();
    }
}
