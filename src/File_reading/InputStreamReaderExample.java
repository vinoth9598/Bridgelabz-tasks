package File_reading;

import java.io.*;

public class InputStreamReaderExample {

    public static void main(String[] args){
        try{
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            System.out.print("Enter your name :");
            String name = br.readLine();
            System.out.println("Hello " + name);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
