package employ_wage;

import java.util.Scanner;

public class EmployWage {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee ID : ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Employee Name :");
		String name = sc.nextLine();
		
		System.out.println("Enter Wage per Hour :");
		double wage = sc.nextDouble();
		
		System.out.println("Enter Hours Worked :");
		double hours = sc.nextDouble();
		
		System.out.println("Enter part Time Hours :");
		double partTime = sc.nextDouble();
		
		Employee emp1 = new Employee(id, name, wage, hours, partTime);
		
		emp1.display();
		
		sc.close();
	}
}
