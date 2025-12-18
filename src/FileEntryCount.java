import java.io.BufferedReader;
import java.io.FileReader ;
import java.io.IOException ;

public class FileEntryCount {

    public static void main(String[] args){

        String fileName = "data.txt";

        int entryCount = 0;

        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            while (br.readLine() != null){
                entryCount++;
            }
        }catch(IOException e){
            e.printStackTrace();
        }

        System.out.println("Number of entries : " + entryCount);
    }
}
