import com.opencsv.CSVReader ;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader ;
import java.io.IOException ;
import java.util.List ;
import java.util.ArrayList ;

public class AddressBookCsvReader {

    public static List<PersonContact> readFromCSV(String filePath)throws IOException{
        List<PersonContact> contacts = new ArrayList<>();

        try(CSVReader read= new CSVReader(new FileReader(filePath))){
            String[] line ;
            read.readNext();

            while((line = read.readNext()) != null){
                PersonContact contact = new PersonContact(
                        line[0],
                        line[1],
                        line[2],
                        line[3]
                );
                contacts.add(contact);
            }

        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }

        return contacts ;
    }
}
