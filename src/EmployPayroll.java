import java.io.*;
import java.util.Scanner ;
import java.util.List ;
import java.util.ArrayList ;

public class EmployPayroll {

    public static void main(String[] args) throws IOException {
//        Scanner input = new Scanner (System.in);
//
//        System.out.print("Enter Employee ID : ");
//        int id = input.nextInt();
//
//        System.out.print("Enter Employee Name :");
//        String name = input.next();
//
//        System.out.print("Enter Employee Salary : ");
//        double salary = input.nextDouble();

//        Create EmployeePayroll Object
        List<EmployeePayroll > employList = new ArrayList<>();
        employList.add(new EmployeePayroll(101, "Vinoth",50000));
        employList.add(new EmployeePayroll(102, "Arun",45000));
        employList.add(new EmployeePayroll(103, "Kiran",60000));

//        write employee payroll to console
        System.out.println("\nEmployee payroll Details ");
        System.out.println("_________________________________");
        System.out.println(employList);

        writeEmployeePayrollToFile(employList);

        String fileName = "employees.txt";
        int totalEntries = EmployeePayrollReader.readAndCountEntries(fileName);

        System.out.println("\n Total Employee Entries :" + totalEntries);
    }

    private static void writeEmployeePayrollToFile(List<EmployeePayroll> employees) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("employees.txt"))){
            for(EmployeePayroll emp : employees){
                bw.write(emp.toString());
                bw.newLine();
            }
            System.out.println("Employee payroll written to file successfully");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

