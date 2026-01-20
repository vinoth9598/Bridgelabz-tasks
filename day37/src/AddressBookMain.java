
public class AddressBookMain {

    public static void main(String[] args){
        AddressBookService service = new AddressBookService();

        Contact contact = new Contact(
                "vinoth",
                "kumar",
                "12 MG Road",
                "Chennai",
                "Tamil Nadu",
                600001,
                "9887878787"
        );

        service.addContact(contact);
        service.getAllContacts().forEach(System.out::println);
    }
}