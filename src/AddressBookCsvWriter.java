import java.io.FileWriter;
import java.io.IOException;
import java.util.List ;
import com.opencsv.CSVWriter;

public class AddressBookCsvWriter {

    public static void writeToCsv(String filePath, List<PersonContact> contacts ){
        try(CSVWriter writer = new CSVWriter(new FileWriter(filePath))){

            String[] header = {"First Name","Email","City","Phone"};
            writer.writeNext(header);

            for(PersonContact contact : contacts){
                String[]  data = {
                        contact.getFirstName(),
                        contact.getEmail(),
                        contact.getCity(),
                        contact.getPhone()
                };
                writer.writeNext(data);
            }

            System.out.println("Address Book written to CSV successfully");

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
