package Gson_format;
import java.util.List ;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.io.FileWriter ;
public class AddressBookJsonWriter {

    public static void writeToJson(String filePath, List<PersonContact> contacts) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try(FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(contacts, writer);
            System.out.println("Address book written json successfully");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
