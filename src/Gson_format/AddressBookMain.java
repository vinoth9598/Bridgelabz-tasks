package Gson_format;
import java.util.Arrays ;
import java.util.List ;
public class AddressBookMain {

    public static void main(String[] args){
        String filePath = "addressbook.json";

        List<PersonContact> contacts = Arrays.asList(
                new PersonContact("Vinoth","vinoth@gmail.com","Chennai","9897878776"),
                new PersonContact("Balamurugan","bala@gmail.com","Kumbakonam","8776655443"),
                new PersonContact("Suresh","suresh@gmail.com","Bangalore","8876763432")
        );


//        Write to Json
        AddressBookJsonWriter.writeToJson(filePath, contacts);

//        Read from json
        List <PersonContact> readContacts = AddressBookJsonReader.readFromJson(filePath);

        System.out.println("\nContacts read from Json :");
        readContacts.forEach(System.out::println);

    }
}
