package day6_part2;
import java.util.Scanner;

public class Sqrt {
	
	public static void main(String[] args) {
		
		System.out.println("Enter sqrt number is :");
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double result = (double) sqrt(n);
		
		System.out.println(result);
		
	}

	private static double sqrt(double n) {
		
		double epsilon = 1e-15 ;
		double t = n ;
		
		while (Math.abs(t - n / t) > epsilon * t) {
			t = (n/t+t)/2.0 ;
			
		}
		return t ;
		
		
	}
}
