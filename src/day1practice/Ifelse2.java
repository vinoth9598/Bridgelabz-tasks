package day1practice;

import java.util.Scanner; 

public class Ifelse2 {
	public static void main (String[] args) {
		System.out.println("Enter Number only 1, 10, 100, 1000 only :");
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		if(number == 1) {
			System.out.println("Unit");
		}else if(number == 10) {
			System.out.println("Ten");
		}else if(number == 100) {
			System.out.println("Hundred");
		}else if (number == 1000) {
			System.out.println("Thousand");
		}
		else {
			System.out.println("Invalid & enter correct number");
		}
		
	}
}
