package day6_part2;

public class MonthlyPayment {

	public static void main(String[] args) {
		double principal_loan = 100000 ;
		double interest = 10 ;
		double year = 5 ;
		
		monthlyPayment(principal_loan, interest, year);
		
		
	}

	public static void monthlyPayment(double p, double i, double y) {

		double payment ;
		
		double n = 12 * y ;
		
		double r = i / (12 * 100);
		
		payment = (p * r) /( 1- (Math.pow(1 + r, -n)));
		
		System.out.println(payment);
	}
}
