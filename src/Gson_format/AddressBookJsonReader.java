package Gson_format;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.IOException;
import java.util.List ;
import java.lang.reflect.Type;
public class AddressBookJsonReader {

    public static List<PersonContact>  readFromJson(String filePath) {
        Gson gson = new Gson();

        Type contactListType = new TypeToken<List<PersonContact>>() {}.getType();

        try(FileReader read = new FileReader(filePath)){
            return gson.fromJson(read, contactListType);
        }catch(IOException e){
            e.printStackTrace();
        }
        return null ;
    }
}
