import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EmployeePayrollReader {
    public static int readAndCountEntries(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;
        int count = 0;

        System.out.println("Employee Payroll File Contents :");
        System.out.println("__________________________________");

        while((line = br.readLine()) != null){
            System.out.println(line);
            count++;
        }

        br.close();
        return count ;
    }
}