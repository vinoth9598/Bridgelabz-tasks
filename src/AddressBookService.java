

import java.util.ArrayList;
import java.util.List;
import java.util.* ;
import java.util.stream.Collectors ;

public class AddressBookService {

    private final List<Person> personList;

    public AddressBookService(List<Person> personList) {
        this.personList = personList;
    }

    public List<Person> sortByPersonName() {

        return personList.stream()
                .sorted(Comparator
                        .comparing(Person::getFirstName, String.CASE_INSENSITIVE_ORDER)
                        .thenComparing(Person::getLastName, String.CASE_INSENSITIVE_ORDER))
                .collect(Collectors.toList());
    }
}
