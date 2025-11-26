
import java.util.*;

interface Total{
    public void total();
}
class TotalWages implements Total{
    @Override
    public void total() {
        System.out.println("Total Wages");
        int hours = 8;
        int wages = 180 ;
        System.out.println(hours * wages);

    }
}
class EmployeeWageBuilder{

    String name ;
    int hours ;
    int partTimeHour;
    double wagePerHour ;

    EmployeeWageBuilder(String name, int hours, double wagePerHour, int partTimeHour){
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
        System.out.println("using interface : _________" );
        new TotalWages().total();
        System.out.println("______________finished_________________");
    }

}
public class EmployWage {
    public static void main(String[] args){
        List<EmployeeWageBuilder> employeeList = new ArrayList<>();

        employeeList.add(new EmployeeWageBuilder("vinoth", 8, 150, 2));
        employeeList.add(new EmployeeWageBuilder("kumar",7, 170, 3));
        employeeList.add(new EmployeeWageBuilder("Arun", 9, 160, 3));


        for(EmployeeWageBuilder e : employeeList){
            e.showDetails();

        }

    }
}
