

import java.util.ArrayList;
import java.util.List;
import java.util.* ;
import java.util.stream.Collectors ;

public class AddressBookService {

    private final List<Person> personList;

    public AddressBookService(List<Person> personList) {
        this.personList = personList;
    }

    // Dictionary: City -> List<Person>
    public Map<String, List<Person>> getPersonsByCity() {
        return personList.stream()
                .collect(Collectors.groupingBy(Person::getCity));
    }

    // Dictionary: State -> List<Person>
    public Map<String, List<Person>> getPersonsByState() {
        return personList.stream()
                .collect(Collectors.groupingBy(Person::getState));
    }

    // View persons for a specific city
    public List<Person> viewPersonsInCity(String city) {
        return personList.stream()
                .filter(p -> p.getCity().equalsIgnoreCase(city))
                .collect(Collectors.toList());
    }

    // View persons for a specific state
    public List<Person> viewPersonsInState(String state) {
        return personList.stream()
                .filter(p -> p.getState().equalsIgnoreCase(state))
                .collect(Collectors.toList());
    }
}
