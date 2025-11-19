package day5_problem;

import java.util.Scanner ;

public class Leapyear {
	public static void main(String[] args) {
		System.out.println("Enter year check leap year or not :");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n%4 == 0) {
			System.out.println("The given year is leap year");
		}else if(n % 400 == 0) {
			System.out.println("The given year is leap year");
		}else {
			System.out.println("The given year is not leap year");
		}
		
	}
}
