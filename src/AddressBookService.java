

import java.util.ArrayList;
import java.util.List;

public class AddressBookService {

    private final List<Person> personList = new ArrayList<>();

    public boolean addPerson(Person person) {
        boolean isDuplicate = personList.stream()
                .anyMatch(existingPerson -> existingPerson.equals(person));

        if (isDuplicate) {
            System.out.println("Duplicate Entry! Person already exists.");
            return false;
        }

        personList.add(person);
        System.out.println("Person added successfully!");
        return true;
    }

    public List<Person> getAllPersons() {
        return personList;
    }
}
