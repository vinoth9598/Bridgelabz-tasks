
import java.util.ArrayList ;
import java.util.List ;
public class AddressBookService {
    private final List<Contact> contactList = new ArrayList<>();

    public void addContact(Contact contact){
        contactList.add(contact);
    }

    public List<Contact> getAllContacts(){
        return contactList ;
    }
}