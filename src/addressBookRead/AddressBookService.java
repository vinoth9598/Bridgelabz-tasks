package addressBookRead;
import java.io.*;
import java.util.*;

public class AddressBookService {

    private static final String File_Name = "addressbook.txt";

    public static void main(String[] args) throws IOException {
        List<PersonContact> contacts = new ArrayList<>();

        contacts.add(new PersonContact("Vinoth","vinoth@gmail.com","9898545454"));
        contacts.add(new PersonContact("Arunkumar","arun@gmail.com","8989787676"));
        contacts.add(new PersonContact("saipriya","priya@gmail.com","8978767676"));

        writeToFile(contacts);

        readFromFile();

    }

    private static void  writeToFile(List<PersonContact> contacts) throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter(File_Name));

        for(PersonContact contact : contacts){
            bw.write(contact.toString());
            bw.newLine();
        }
        bw.close();
        System.out.println("Address Book written to file successfully");
        System.out.println("Total entries written :" + contacts.size());

    }

    private static void readFromFile()throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(File_Name));
        String line ;
        int count = 0;

        System.out.println("\nAddress Book Contents");
        System.out.println("_____________________");

        while((line = br.readLine()) != null){
            System.out.println(line);
            count++ ;
        }

        br.close();
        System.out.println("Total entries Read :" + count);
    }

}
