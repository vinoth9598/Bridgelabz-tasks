
import java.util.ArrayList ;
import java.util.List ;
public class AddressBookService {
    private final List<Person> personList = new ArrayList<>();

    public void addPerson(Person person){
        personList.add(person);
        System.out.println("Person added successfully!");
    }

    public List<Person> getPersonList(){return personList;}
}