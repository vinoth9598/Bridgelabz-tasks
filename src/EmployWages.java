
import java.util.*;
class Employee{
    String name ;
    int hours ;
    int partTimeHour;
    double wagePerHour ;

    Employee(String name, int hours, double wagePerHour, int partTimeHour){
        this.name = name ;
        this.hours = hours ;
        this.wagePerHour = wagePerHour ;
        this.partTimeHour = partTimeHour ;
    }

    String addenceCheck(){
        int random =(int) Math.floor(Math.random()*10) %2;
//        System.out.println(random);
        String result = random == 0 ? "Absent":"Present";
        return result ;
    }

    double calculateWage(){
        return hours * wagePerHour ;
    }
    double partTimeWage(){
        return wagePerHour * partTimeHour ;
    }
    void showDetails(){
        System.out.println("Employee :" + name);
        System.out.println("Hours Worked :" + hours);
        System.out.println("Wage/hr :" + wagePerHour);
        System.out.println("Addence check :" + addenceCheck());
        System.out.println("Total Wage " + calculateWage());
        System.out.println("Part time wage :" + partTimeWage());
        System.out.println("_______________________________");
    }

}
public class EmployWages {
    public static void main(String[] args){
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("vinoth", 8, 150, 2));
        employeeList.add(new Employee("kumar",7, 170, 3));
        employeeList.add(new Employee("Arun", 9, 160, 3));

        for(Employee e : employeeList){
            e.showDetails();
        }
    }
}
