

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddressBookService {

    private final List<Person> personList ;

    public AddressBookService(List<Person> personList) {
        this.personList = personList;
    }

    public boolean editPerson(String firstName, String lastName,
                              String address, String city,
                              String state, int zip,
                              String phoneNumber) {

        for (Person person : personList) {
            if (person.getFirstName().equalsIgnoreCase(firstName)
                    && person.getLastName().equalsIgnoreCase(lastName)) {

                person.setAddress(address);
                person.setCity(city);
                person.setState(state);
                person.setZip(zip);
                person.setPhoneNumber(phoneNumber);
                return true;
            }
        }
        return false;
    }

    public boolean deletePerson(String firstName, String lastName){
        Iterator<Person> iterator = personList.iterator();
        while (iterator.hasNext()){
            Person person = iterator.next();
            if(person.getFirstName().equalsIgnoreCase(firstName) &&
            person.getLastName().equalsIgnoreCase(lastName)){
                iterator.remove();
                return true ;
            }
        }
        return false ;
    }
    public List<Person> getAllPersons() {
        return personList;
    }
}
