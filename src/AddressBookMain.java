import java.io.IOException;
import java.util.Arrays ;
import java.util.List ;
public class AddressBookMain {

    public static void main(String[] args) throws IOException {

        String filePath = "addressbook.csv";

        List<PersonContact> contacts = Arrays.asList(
                new PersonContact("vino","vinoth@gmail.com","chennai","9878767665"),
                new PersonContact("vignesh","vignesh@gmail.com","Kumbakonam","8987767676")
        );

        AddressBookCsvWriter.writeToCsv(filePath,contacts);

//        Read from csv
        List<PersonContact> readContacts = AddressBookCsvReader.readFromCSV(filePath);

        System.out.println("\ncontacts read from csv :");
        readContacts.forEach(System.out::println);
    }
}
