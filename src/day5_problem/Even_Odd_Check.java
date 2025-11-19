package day5_problem;
import java.util.Scanner ;

public class Even_Odd_Check {
	public static void main(String[] args) {
		System.out.println("Enter value N :");
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		
//		Use ternary operator ;
		
		String result = n % 2 == 0 ? n + " is Even number" : n + " is odd number";
		System.out.println(result);
	}
}
