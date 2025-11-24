package employ_wage;

public class Employee {
	
	private int empId ;
	private String empName ;
	private double wagePerHour ;
	private double hoursWorked ;
	private double partTimeHours ;
	
	public Employee(int empId, String empName, double wagePerHour, double hoursWorked, double partTimeHours) {
		this.empId = empId ;
		this.empName = empName ;
		this.wagePerHour = wagePerHour ;
		this.hoursWorked = hoursWorked ;
		this.partTimeHours = partTimeHours ;
	}
	
	public double calculateWage() {
		return wagePerHour * hoursWorked ;
	}
	
	public double calculatePart() {
		return wagePerHour * partTimeHours ;
	}
	
	public void display() {
		System.out.println("Employee Id : " + empId);
		System.out.println("Employee name :" + empName);
		System.out.println("Wage per Hour :" + wagePerHour);
		System.out.println("Hours worked :" + hoursWorked);
		System.out.println("Daily Wage :" + calculateWage());
		System.out.println("Part time Wage :"+ calculatePart());
	}
}
