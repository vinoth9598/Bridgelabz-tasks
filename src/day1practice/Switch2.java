package day1practice;
import java.util.Scanner ;

public class Switch2 {
	public static void main(String[] args) {
		System.out.println("Enter given Number :");
		
		Scanner sc = new Scanner(System.in);
		
		int givenNumber = sc.nextInt();
		
		getMonth(givenNumber);
	}

	private static void getMonth(int num) {
		switch(num) {
			case 1 -> System.out.println("January");
			case 2 -> System.out.println("Feb");
			case 3 -> System.out.println("Mar");
			case 4 -> System.out.println("April");
			case 5 -> System.out.println("May");
			case 6 -> System.out.println("Jun");
			case 7 -> System.out.println("July");
			case 8 -> System.out.println("Aug");
			case 9 -> System.out.println("Sep");
			case 10 -> System.out.println("Oct");
			case 11 -> System.out.println("Nov");
			case 12 -> System.out.println("Dec");
			default -> System.out.println("Invalid input number");
			
		}
		
	}
	
	
}
